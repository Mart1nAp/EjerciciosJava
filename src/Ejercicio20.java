import java.util.Scanner;

public class Ejercicio20 {

/*    20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posicion (" + i + "," + j + "): ");
                matriz[i][j] = leer.nextInt();
            }
        }
        comprobacion(matriz);
    }

    public static void comprobacion(int[][] matriz) {
        int columna = 0;
        int fila = 0;
        int trans1 = 0;
        int trans2 = 0;

        int max = 2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    columna += matriz[i][j];
                }
                if (i == j) {
                    trans1 += matriz[i][j];
                }
                if (i == 0) {
                    fila += matriz[i][j];
                }
                if (j == max) {
                    trans2 += matriz[i][j];
                    max -= 1;
                }
            }
        }

        System.out.println("Este es el valor de la columna: " + columna);
        System.out.println("Este es el valor de la fila: " + fila);
        System.out.println("Este es el valor de la transversal 1: " + trans1);
        System.out.println("Este es el valor de la transversal 2: " + trans2);
        System.out.println("");

        if (columna == fila && columna == trans1 && columna == trans2) {
            System.out.println("La matriz es magica.");
        } else {
            System.out.println("La matriz no es magica.");
        }
    }
}
