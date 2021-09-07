public class exercise4 {
    public static void main(String[] args) {
        //Crea una aplicación que dibuje una escalera de números,
        //siendo cada linea números empezando en uno y acabando en el numero de la linea. Este es un ejemplo, si introducimos un 5 como altura:

        int num=9;
        getEscaleraNumerosInvertidos(num);
    }

    public static void getEscaleraNumerosInvertidos (int num){

        for (int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
