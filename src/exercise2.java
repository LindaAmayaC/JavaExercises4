

public class exercise2 {
    public static void main(String[] args) {
        //Crea una aplicación que dibuje una escalera inversa de asteriscos.
        //Nosotros le pasamos la altura de la escalera inversa por teclado.
        int num = 3;
        getEscaleraInvetida(num);
    }

    private static void getEscaleraInvetida(int num) {
        for (int i = num; i > 0; i--) {
            for(int j = i ; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
