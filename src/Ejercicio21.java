import java.util.Scanner;

public class Ejercicio21 {

/*    21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
    que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
    menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
    columna de la matriz M en la cual empieza el primer elemento de la submatriz P.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        llenado(matrizM,matrizP);
        impresion(matrizM,matrizP);
        comprobacion(matrizM,matrizP);
    }

    public static void llenado(int[][]matrizM ,int[][] matrizP) {

        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                matrizM[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizP[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

    }

    public static void comprobacion(int[][] matrizM, int[][] matrizP) {
        //int cont = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                //boolean coinciden = true;
                for (int x = 0; x < 3; x++) {
                    for (int z = 0; z < 3; z++) {
                        if (matrizM[i + x][j + z] != matrizP[x][z]) {
                            System.out.println("La posicicion es: "+i+","+j);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void impresion (int[][] matrizM, int[][] matrizP) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }

    }
}





