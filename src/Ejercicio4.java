import java.util.Scanner;

public class Ejercicio4 {

/*    4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int centigrados;
        int fahren;

        System.out.println("Ingrese los grados en centigrados: ");
        centigrados = leer.nextInt();

        fahren = 32 + (9 * centigrados / 5);

        System.out.println("Los grados centigrados ingresados ("+centigrados+"°) es igual a "
        +fahren+"° Fahrenheit.");
    }
}
