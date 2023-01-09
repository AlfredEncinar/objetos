package ejercicio4;

//Desarrolla una clase Cancion con los siguientes atributos:
//- titulo: una variable String que guarda el título de la canción.
//- autor: una variable String que guarda el autor de la canción.
//y los siguientes métodos:
//- Cancion (String, String): constructor que recibe como parámetros el títul0
// y el autor de la canción (por este orden).
//- Cancion (): constructor predeterminado que inicializa el título y el autor a cadenas vacías.
//- dameTitulo(): devuelve el título de la canción.
//- dameAutor(): devuelve el autor de la canción.
//- ponTitulo(String): establece el título de la canción.

public class Cancion {



    private String titulo;

    private String autor;

    public Cancion (String ti , String au){

        this.titulo = ti;
        this.autor = au;

    }


    public String getTitulo(){

        return titulo;
    }

    public String getAutor(){

        return autor;
    }

     public void  setTitulo(String titulo){

        this.titulo = titulo;

    }



}
