import java.util.Scanner;

public class Ejercicio3 {

/*    3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
    Java.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();

        System.out.println("La frase en minuscula es: "+ frase.toLowerCase());
        System.out.println("La frase en mayuscula es: "+ frase.toUpperCase());


    }
}
