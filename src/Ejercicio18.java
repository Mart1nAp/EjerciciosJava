public class Ejercicio18 {

/*    18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    obtiene cambiando sus filas por columnas (o viceversa).*/

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];

        //llenado de la matriz.

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 30) + 1;
            }
        }
        //Transpuesta.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        impresion(matriz, transpuesta);
    }

    public static void impresion(int[][] matriz, int[][] transpuesta) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
