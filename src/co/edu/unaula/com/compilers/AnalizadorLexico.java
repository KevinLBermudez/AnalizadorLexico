package co.edu.unaula.com.compilers;

import java.io.IOException;
import java.util.Hashtable;

public class AnalizadorLexico {
    public int linea = 1;
    private char vistazo = ' ';
    private Hashtable palabras = new Hashtable();

    void reservar(Palabra t) {
        this.palabras.put(t.lexema, t);
    }

    public AnalizadorLexico() {
        this.reservar(new Palabra(258, "true"));
        this.reservar(new Palabra(259, "false"));
    }

    public Token explorar() throws IOException {
        while(true) {
            if (this.vistazo != ' ' && this.vistazo != '\t') {
                if (this.vistazo != '\n') {
                    if (Character.isDigit(this.vistazo)) {
                        int v = 0;

                        do {
                            v = 10 * v + Character.digit(this.vistazo, 10);
                            this.vistazo = (char)System.in.read();
                        } while(Character.isDigit(this.vistazo));

                        Num valor = new Num(v);
                        System.out.println(valor.getCadena());
                        return valor;
                    }

                    if (!Character.isLetter(this.vistazo)) {
                        Token t = new Token(this.vistazo);
                        System.out.println(t.getEtiqueta());
                        this.vistazo = ' ';
                        return t;
                    }

                    StringBuffer b = new StringBuffer();

                    do {
                        b.append(this.vistazo);
                        this.vistazo = (char)System.in.read();
                    } while(Character.isLetterOrDigit(this.vistazo));

                    String s = b.toString();
                    Palabra w = (Palabra)this.palabras.get(s);
                    if (w != null) {
                        System.out.println(w.getLexema());
                        return w;
                    }

                    w = new Palabra(257, s);
                    this.palabras.put(s, w);
                    System.out.println(w.getLexema());
                    return w;
                }

                ++this.linea;
            }

            this.vistazo = (char)System.in.read();
        }
    }

    public Hashtable getPalabras() {
        return this.palabras;
    }
}
