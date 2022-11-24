package Pizza;

import Pizza.Pizza;

public class UsoPizza {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("familiar" , "cuatro quesos","pedida","");
        Pizza p2 = new Pizza("mediana","margarita" , "pedida","");
        Pizza p3 = new Pizza("mediana","marinera" , "pedida","");
        Pizza p4 = new Pizza("familiar","cuatro quesos" , "","servida");



        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p4.servida();
        System.out.println(p4);

        System.out.println("pedidas : " + Pizza.getTotalPedidas());
        System.out.println("servidas : " + Pizza.getTotalServvidas());



    }
}
