package operaciones;

public class Pruebamatematica {

    public static void main(String[] args) {
        matematica ob1 = new matematica();
        ob1.a = 25;
        ob1.b = 35;
        ob1.sumar();
        int resultado = ob1.sumar1();
        System.out.println("El resultado de la suma es "+ob1.sumar1());
    }
}
