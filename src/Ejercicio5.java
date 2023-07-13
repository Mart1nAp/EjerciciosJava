import java.util.Scanner;

public class Ejercicio5 {

/* 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
    Math.sqrt().*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero entero: ");
        numero = leer.nextInt();

        System.out.println("El numero ingresado es: "+numero+", el doble es: " +(numero*2)+
                ", El triple es: "+(numero*3)+ " y su raiz cuadrada es: "+(Math.sqrt(numero)));
    }
}
