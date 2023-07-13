import java.util.Scanner;

public class EjercicioExtra22 {
/*    22.Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
    muestre la suma de sus elementos.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int m;
        int suma = 0;
        System.out.println("Ingrese el numero de filas: ");
        n = leer.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        m = leer.nextInt();
        int [][] matriz = new int[n][m];

        for (int i = 0;i<n;i++){
            for (int j =0;j<m;j++){
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        for (int i = 0;i <n;i++){
            for (int j = 0;j<m;j++){
                suma += matriz[i][j];
            }
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Esta es la suma: "+suma);
    }
}

