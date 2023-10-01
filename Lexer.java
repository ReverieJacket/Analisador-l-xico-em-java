// Importa as classes Java necessárias para manipulação de arquivos e exceções
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

// Classe principal, lê o código fonte e produz uma lista de tokens
public class Lexer {
    private String sourceCode;
    private String linha;
    private String token;
    private Queue<String> tokenLista;
    private BufferedReader sourceReader;

    public Lexer (String file) {
    this.sourceCode = file;
    this.linha = new String();
    this.token = new String();
    this.tokenLista = new LinkedList<>();  
    try {
        this.sourceReader = new BufferedReader(new FileReader(this.sourceCode));
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado!");
        e.printStackTrace();
    }
    }

    public void analisar(){
        try {
            // Inicia um loop para ler cada linha do arquivo
            while ((this.linha = sourceReader.readLine()) != null) {
                // Inicia um loop para iterar por cada caractere na linha atual
                for (int i = 0; i < linha.length(); i++) {
                    // Obtém o caractere atual da linha
                    char caractere = linha.charAt(i);
                    // Imprime o caractere no console
                    System.out.print(caractere);
                }
        
                // Imprime um caractere de nova linha para separar as linhas
                System.out.println();
        
                // Pausa a execução do programa por 1000 milissegundos (1 segundo)
                Thread.sleep(1000);
            }
            } catch (IOException | InterruptedException e) {
                // Se houver uma exceção (erro) durante a leitura do arquivo ou pausa, imprime os detalhes do erro
                e.printStackTrace();
            }
        }
    }






