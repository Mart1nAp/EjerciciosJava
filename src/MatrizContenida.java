public class MatrizContenida {

    public static void main(String[] args) {
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];

        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                M[i][j] = (int) (Math.random() * 30) + 1;
            }
        }

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                P[i][j] = (int) (Math.random() * 30) + 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Esta es M: "+P[0].length);

        boolean encontrada = false;
        int filaInicio = -1;
        int columnaInicio = -1;

        // Iterar sobre todas las submatrices de 3x3 en M
        for (int i = 0; i <= M.length - P.length; i++) {
            for (int j = 0; j <= M.length - P[0].length; j++) {
                boolean coinciden = true;
                // Comprobar si la submatriz coincide con P
                for (int m = 0; m < P.length; m++) {
                    for (int n = 0; n < P.length; n++) {
                        if (M[i + m][j + n] != P[m][n]) {
                            coinciden = false;
                            break;
                        }
                    }
                    if (!coinciden) {
                        break;
                    }
                }
                if (coinciden) {
                    encontrada = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        // Imprimir el resultado
        if (encontrada) {
            System.out.println("La submatriz P está contenida en la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + filaInicio + " y columna " + columnaInicio + " de la matriz M.");
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }
    }
}

