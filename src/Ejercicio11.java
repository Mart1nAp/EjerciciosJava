import java.util.Scanner;

public class Ejercicio11 {

   /* 11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:

    MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
    Elija opción:

    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
    pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
    programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
    seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
    del programa, caso contrario se vuelve a mostrar el menú.*/
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        int operacion;
        int opcion;

        System.out.println("Ingrese el #1: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el #2: ");
        numero2 = leer.nextInt();

        System.out.println("    MENU\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "5. Salir\n" +
                "   Elija opción:");
        opcion = leer.nextInt();

        switch (opcion){
            case 1:
                operacion = numero1+numero2;
                System.out.println("la suma de: "+numero1+ " + " +numero2+" = " +operacion);
                break;
            case 2:
                operacion = numero1-numero2;
                System.out.println("la resta de: "+numero1+ " - " +numero2+" = " +operacion);
                break;
            case 3:
                operacion = numero1*numero2;
                System.out.println("la multiplicación de: "+numero1+ " * " +numero2+" = " +operacion);
                break;
            case 4:
                operacion = numero1/numero2;
                System.out.println("la  división de: "+numero1+ " / " +numero2+" = " +operacion);
                break;
            case 5:
                System.out.println("Saliendo.");

        }
    }
}
