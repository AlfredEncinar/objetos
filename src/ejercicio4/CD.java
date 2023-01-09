package ejercicio4;

//Desarrola una clase CD con los siguientes atributos:
//- canciones: un array de objetos de la clase Cancion
//- contador: la siguiente posición libre del array canciones.
//y los siguientes métodos:
//- CD(): constructor predeterminado (creará el array canciones).
//- numeroCanciones(): devuleve el valor del contador de canciones.
//- dameCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
//- grabaCancion(int, Cancion): cambia la Cancion de la posición indicada
// por la nueva Cancion proporcionada.
//- agregaCancion(Cancion): agrega al final del array la Cancion proporcionada.
//- elimina(int): elimina la canción que se encuentra en la posición indicada.

import java.util.ArrayList;
import java.util.Scanner;
public class CD {

    ArrayList<Cancion> canciones = new ArrayList<>();
    Cancion cancion1 = new Cancion("alfred biographie" , " alfred");
    public CD(ArrayList<Cancion> canciones) {

        this.canciones = canciones;

        canciones.add(cancion1);
        canciones.add(new Cancion("caperuzita" , "Manolo"));

    }




    }







