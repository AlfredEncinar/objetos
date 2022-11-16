public class UsoPizza {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("familiar" , "cuatro quesos");
        Pizza p2 = new Pizza("mediana","margarita");
        Pizza p3 = new Pizza("mediana","marinera");
        Pizza p4 = new Pizza("familiar","cuatro quesos");


       p1.contadorP(1);
       p2.contadorP(1);
       p3.contadorP(1);
       p4.contadorP(1);

       p4.contadorS(1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("pedidas : " + Pizza.getTotalPedidas());
        System.out.println("servidas : " + Pizza.getTotalServvidas());



    }
}
