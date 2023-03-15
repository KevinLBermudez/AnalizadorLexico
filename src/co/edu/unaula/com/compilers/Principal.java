package co.edu.unaula.com.compilers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public class Principal {

    public Principal() {
    }

    public static void main(String[] ar) throws IOException {
        AnalizadorLexico aL = new AnalizadorLexico();
        aL.explorar();
        Hashtable palSalida = aL.getPalabras();
        Enumeration elements = palSalida.elements();

        while(elements.hasMoreElements()) {
            System.out.println("hashtable valores: " + ((Token)elements.nextElement()).getEtiqueta());
        }

        Enumeration llaves = palSalida.keys();

        while(llaves.hasMoreElements()) {
            System.out.println("hashtable llaves: " + llaves.nextElement());
        }
    }
}
