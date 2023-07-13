import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio19 {

/*    19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
    una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
    de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        //Random random = new Random();

        //llenado de la matriz.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (ThreadLocalRandom.current().nextInt(-3, 3 + 1));
            }
        }
        //Transpuesta.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[j][i] = (matriz[i][j]);
            }
        }
        impresion(matriz, transpuesta);
        comprobacion(matriz,transpuesta);
    }

    public static void impresion(int[][] matriz, int[][] transpuesta) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void comprobacion(int[][] matriz, int[][] transpuesta){
        int conta=0;

        for (int i = 0; i< 3;i++){
            for (int j = 0; j < 3;j++){
                if (((matriz[i][j])*-1) == (transpuesta[i][j])){
                    conta += 1;
                }
            }
        }
    if (conta == 9){
        System.out.println("La matriz es antisimetrica");
    }else {
        System.out.println("La matriz no es antisimetrica");
    }
    }

}