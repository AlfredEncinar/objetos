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

public class CD {

    public static void main(String[] args) {

        Cancion c1 = new Cancion("alfred biography" ,"Alfred");
        System.out.println(c1.dameAutor() + "\t" + c1.dameTitulo());

    }


}
