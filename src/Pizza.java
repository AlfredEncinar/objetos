//Crea la clase Pizza con los atributos y métodos necesarios.
// Sobre cada pizza se necesita saber el tamaño.(mediana o familiar),
// el tipo (margarita, cuatro quesos o marinera) y su estado (pedida o servida).
// La clase debe almacenar información sobre el número total de pizzas que se han pedido
// y que se han servido.
// Siempre que se crea una pizza nueva, su estado es "pedida".
// Crea una clase de prueba que haga que responda como en el ejemplo de salida.


public class Pizza {

    private String tamaño;
    private String tipo;
    private String estado;

    Pizza(String ta, String ti, String es) {

        this.tamaño = ta;
        this.tipo = ti;
        this.estado = es;

    }

}
