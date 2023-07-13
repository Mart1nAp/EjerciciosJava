import java.util.Scanner;

public class EjercicioExtra20 {

/*   20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
    parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del arreglo: ");
        n = leer.nextInt();
        int[] vector = new int[n];

        llenado(vector, n);
        impresion(vector,n);

    }

    public static void llenado (int []vector, int n) {
         for (int i = 0; i< n; i++){
             vector[i] = (int) (Math.random() * 9) + 1;
         }
    }

    public static void impresion(int []vector, int n) {
        for (int i = 0; i<n; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}
