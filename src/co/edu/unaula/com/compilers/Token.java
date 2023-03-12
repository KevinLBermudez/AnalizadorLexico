package co.edu.unaula.com.compilers;

public class Token {
    public final int etiqueta;

    public Token(int t) {
        this.etiqueta = t;
    }

    public int getEtiqueta() {
        return this.etiqueta;
    }
}
