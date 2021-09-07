public class exercise3 {
    public static void main(String[] args) {
        //Crea una aplicación que dibuje una escalera de números, siendo cada linea un numero. Nosotros le pasamos la altura por teclado.
        int num=9;
        getEscaleraNumeros(num);
    }

    public static void getEscaleraNumeros (int num){

        for (int i = 1 ; i <= num ; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }

}