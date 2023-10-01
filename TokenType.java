public enum TokenType {
    NUM_INT,
    NUM_DEC,
    ID,
    TEXTO,
    INT,
    FLOAT,
    CHAR,
    BOOLEAN,
    VOID,
    IF,
    ELSE,
    FOR,
    WHILE,
    SCANF,
    PRINTLN,
    MAIN,
    RETURN,
    IGUAL("="),  
    MAIS("+"),
    MENOS("-"),
    ASTERISTICO("*"),
    BARRA("/"),
    PORCENTAGEM("%"),
    AND("&&"),
    OR("||"),
    EXCLAMACAO("!"),
    COMP,    
    ABREPARENTESIS("("),
    FECGAPARENTESIS(")"),
    ABRECOLCHETE("["),
    FECHACOLCHETE("]"),
    ABRECHAVES("{"),
    FECHACHAVES("}"),
    VIRGULA(","),
    PONTOEVIRGULA(";");


    private String valor;
    
    private TokenType(String valor) {
        this.valor = valor;
    }
    private TokenType() {
        this.valor = null;
    }
    
    public String getValor() {
        return this.valor;
    }

}
