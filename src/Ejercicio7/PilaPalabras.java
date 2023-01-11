package Ejercicio7;

import java.util.LinkedList;

public class PilaPalabras {

    private LinkedList<String> pila;

    public PilaPalabras() {
        pila = new LinkedList<String>();
    }

    public void apilarPalabra(String palabra) {
        pila.addFirst(palabra);
    }

    public String desapilarPalabra() {
        return pila.removeFirst();
    }

    public String obtenerPalabraCima() {
        return pila.getFirst();
    }

    public boolean pilaPalabrasVacia() {
        return pila.isEmpty();
    }
}


