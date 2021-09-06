public class exercise1 {
    public static void main(String[] args) {
        // Crea una aplicación que dibuje una escalera de asteriscos.
        // Nosotros le pasamos la altura de la escalera por teclado. Este es un ejemplo si insertaras un 5 de altura:

        int num = 5;
        getEscalera(num);
    }

    private static void getEscalera(int num) {
        String escalera = "*";

        for (int i = 0;  num > i; i++) {
            System.out.println(escalera);
            escalera = escalera + "*";
        }
    }
}
