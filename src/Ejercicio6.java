import java.util.Scanner;

public class Ejercicio6 {

   /* 6. Crear un programa que dado un numero determine si es par o impar.*/
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero: ");
        numero = leer.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero es par.");
        }else{
            System.out.println("El numero es impar.");
        }

    }
}
