// Importa as classes Java necessárias para manipulação de arquivos e exceções
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Essa é a classe principal que realiza a análise léxica. Ela lê o código-fonte e produz uma lista de tokens.
public class Reader {
    public static void main(String[] args) {
        // Define o nome do arquivo a ser lido
        String nomeArquivo = "Exemplo.txt";

        // Tenta abrir o arquivo para leitura
        try (BufferedReader sourceReader = new BufferedReader(new FileReader(nomeArquivo))) {
            // Declara uma variável para armazenar cada linha de texto
            String linha;

            // Inicia um loop para ler cada linha do arquivo
            while ((linha = sourceReader.readLine()) != null) {
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
