import javax.swing.*;
import java.util.Scanner;

public class EjercicioExtra19 {

/*    19. Escriba un programa que averigüe si dos vectores de N enteros son iguales
          (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
          elementos).*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;


        System.out.println("Ingrese el tamaño de los vectores: ");
        n = leer.nextInt();

        int[] vector = new int[n];
        int[] vector2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la posicion " + i + " del vector 1:");
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la posicion " + i + " del vector 2:");
            vector2[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vector[i] != vector2[i]) {
                System.out.println("En la posición " + i + " los vectores son diferentes.");
                break;
            }

        }
    }
}

