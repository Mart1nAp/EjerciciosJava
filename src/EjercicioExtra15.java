import java.util.Scanner;

public class EjercicioExtra15 {

/*    15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese el #1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el #2: ");
        num2 = leer.nextInt();


        operaciones(num1,num2,leer);
    }

    public static void operaciones(int num1, int num2,Scanner leer) {
        int opcion;
        int suma;
        int resta;
        int multi;
        int division;

        System.out.println("Elija la operacion que desea (El numeral):");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        opcion = leer.nextInt();


        switch (opcion){
            case 1:
                suma = num1 + num2;
                System.out.println("La suma de "+num1+" y "+num2+" es:"+suma);
                break;
            case 2:
                resta = num1 - num2;
                System.out.println("La resta de "+num1+" y "+num2+" es:"+resta);
                break;
            case 3:
                multi = num1 * num2;
                System.out.println("La multiplicación de "+num1+" y "+num2+" es:"+multi);
                break;
            case 4:
                if (num1 == 0 || num2 == 0){
                    System.out.println("No es posible dividir por cero.");
                }else {
                    division = num1 / num2;
                    System.out.println("La división de " + num1 + " y " + num2 + " es:" + division);
                    break;
                }
        }
    }
}
