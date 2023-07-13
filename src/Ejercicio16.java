import java.util.Scanner;

import static java.lang.Math.random;

public class Ejercicio16 {

/*    16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int buscado;
        int contador=0;

        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n;i++){
            vector[i] = (int) (random()*20) + 1;
            //System.out.println(vector[i]);
        }

        System.out.println("Ingrese el numero a buscar: ");
        buscado = leer.nextInt();

        for (int i = 0; i < n;i++){
            if (vector[i] == buscado){
                contador += 1;
                System.out.println("El numero buscado se encuntra en la posición: "+i);
            }
        }
        if (contador == 0){
            System.out.println("El numero no se encuentra en el vector.");
        }else {
            System.out.println("El numero se repite: " + contador + " veces.");
        }
    }
}
