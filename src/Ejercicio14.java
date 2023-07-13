import java.util.Scanner;

public class Ejercicio14 {

/*  14.  Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
            (void).
    El cambio de divisas es:

 * 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int euros;
        //int conversion;

        System.out.println("ingrese la cantidad de euros a convertir: ");
        euros = leer.nextInt();

        conversion(euros);

    }

    public static void conversion(int euros) {
        float yen;
        float dolar;
        float libras;

        yen = (float) (euros * 129.852);
        dolar = (float) (euros * 1.28611);
        libras = (float) (euros * 0.86);

        System.out.println("El numero de euros(" + euros + ") es igual a: "
                + yen + " yenes, "
                + dolar + " dolares, "
                + libras + " libras.");
    }

}

