import java.util.Scanner;

public class Ejercicio10 {

    /*10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese un valor positivo: ");
        numero = leer.nextInt();

        if (numero > 0) {
            while (suma < numero) {
                System.out.println("Ingrese un valor: ");
                suma = leer.nextInt();
                suma += suma;
            }
        } else {
            System.out.println("Numero ingresado no valido");
        }
        System.out.println("La suma de los valores es igual a: "+suma+ " y supera al numero original "+numero);
    }
}

