import java.util.Scanner;

public class EjercicioExtra18 {

/*    18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
    N, con los valores ingresados por el usuario.*/
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        int suma=0;

        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0;i<n;i++){
            System.out.println("Ingrese el valor de la posicion "+i+":");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: "+suma);
    }
}
