public class Token {
    private Enum nome;
    private TokenType tipo;
    private String valor;
    private int position;

    public Token(Enum nome, TokenType tipo, String valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
}
// getters and setters
