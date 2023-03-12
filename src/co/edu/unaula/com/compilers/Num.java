package co.edu.unaula.com.compilers;

public class Num extends Token  {
    public final int valor;

    public Num(int v) {
        super(256);
        this.valor = v;
    }

    public String getCadena() {
        return "(Etiqueta.NUM , " + this.valor + ")";
    }
}
