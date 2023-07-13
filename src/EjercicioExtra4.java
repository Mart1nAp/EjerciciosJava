import java.util.Scanner;

public class EjercicioExtra4 {

/*    4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero entre 1 a 10: ");
        numero = leer.nextInt();

        operacion(numero);

    }

    public static void operacion(int numero) {


        switch (numero) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Numero fuera de rango.");
        }
    }
}

