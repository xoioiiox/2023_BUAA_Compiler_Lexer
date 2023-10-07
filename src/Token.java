public class Token {
    public LexType lexType;
    public String val;

    public Token(LexType lexType, String val) {
        this.lexType = lexType;
        this.val = val;
    }

}
