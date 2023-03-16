package co.edu.unaula.com.compilers;

public class Palabra extends Token{
    public final String lexema;

    public Palabra(int t, String s) {
        super(t);
        this.lexema = new String(s);
    }

    public String getLexema() {
        String cadena = "";
        if (this.lexema.equals("true")) {
            cadena = "Etiqueta.TRUE";
        }else if(this.lexema.equals("+")){
            cadena = "Etiqueta.SUMA";
        }else if(this.lexema.equals("-")){
            cadena = "Etiqueta.MENOS";
        }else if(this.lexema.equals("*")){
            cadena = "Etiqueta.MULTIPLICACION";
        }else if(this.lexema.equals("/")){
            cadena = "Etiqueta.DIVISION";
        }else if(this.lexema.equals(">")){
            cadena = "Etiqueta.MAYOR";
        }else if(this.lexema.equals(">=")){
            cadena = "Etiqueta.MAYOR o IGUAL";
        }else if(this.lexema.equals("<")){
            cadena = "Etiqueta.MENOR";
        }else if(this.lexema.equals("<=")){
            cadena = "Etiqueta.MENOR o IGUAL";
        }else if(this.lexema.equals("//")){
            cadena = "Etiquete.COMENTARIO";
        }else if (this.lexema.equals("false")) {
            cadena = "Etiqueta.FALSE";
        } else {
            cadena = "Etiqueta.ID";
        }

        return "(" + cadena + " , " + this.lexema + ")";
    }
}
