package Pizza;//Crea la clase Pizza.Pizza con los atributos y métodos necesarios.
// Sobre cada pizza se necesita saber el tamaño.(mediana o familiar),
// el tipo (margarita, cuatro quesos o marinera) y su estado (pedida o servida).
// La clase debe almacenar información sobre el número total de pizzas que se han pedido
// y que se han servido.
// Siempre que se crea una pizza nueva, su estado es "pedida".
// Crea una clase de prueba que haga que responda como en el ejemplo de salida.


public class Pizza {

    private static int totalPedidas = 0;
    public static int getTotalPedidas() { return totalPedidas; }
    private static int totalServidas = 0;
    public static int getTotalServvidas() { return totalServidas; }

    private String tamaño;
    private String tipo;

    private String estado;

    private String estadoS;
    Pizza(String ta, String ti , String pedida, String servida) {

        this.tamaño = ta;
        this.tipo = ti;
        this.estado = pedida;
        this.estadoS = servida;

    }

    public int servida(){


        return totalServidas++;
    }




    @Override
    public String toString() {

        String salida;

        salida = String.format("Pizza.Pizza %s  %s  %s  %s" ,tamaño , tipo ,estado,estadoS);

        totalPedidas++;

        return salida;

    }
}
