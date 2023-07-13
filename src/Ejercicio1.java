import java.util.Scanner;

public class Ejercicio1 {


/*    1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;

        System.out.println("Ingrese el # 1: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el # 2: ");
        numero2 = leer.nextInt();

        suma = numero1+numero2;

        System.out.println("La suma de "+numero1+" y " +numero2+ " es igual a: "+suma);


    }
}
