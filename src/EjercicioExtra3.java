import java.util.Scanner;

public class EjercicioExtra3 {

/*    3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
    String.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;

        System.out.println("Ingrese una letra: ");
        letra = leer.nextLine();

        comprobacion(letra);
    }

    public static void comprobacion(String letra){

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")){

            System.out.println("Ingreso una vocal.");
        }else {
            System.out.println("El caracter ingresado no es una vocal.");
        }



    }
}
