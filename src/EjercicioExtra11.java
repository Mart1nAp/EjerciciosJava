import java.util.Scanner;

public class EjercicioExtra11 {

/*    11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
    operador de división. Nota: recordar que las variables de tipo entero truncan los
    números o resultados.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Ingrese el numero: ");
        numero = leer.nextInt();

        while (numero > 0 ){
            numero = numero /10;
            contador += 1;
        }
        System.out.println("El numero de digitos es: "+contador);
    }
}
