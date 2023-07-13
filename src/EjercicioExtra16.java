import java.util.Scanner;

public class EjercicioExtra16 {

/*    16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String pregunta;
        boolean decision;


        do {
            System.out.println("Ingrese el nombre: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente

            if (edad >= 18){
                System.out.println(nombre+ " con la edad: "+edad+ ", es mayor de edad.");
            }else {
                System.out.println(nombre+ " con la edad: "+edad+ ", es menor de edad.");
            }

            System.out.println("Desea seguir ingresando datos(Si/No): ");
            pregunta = leer.nextLine();

            if (pregunta.equals("No")){
                decision = false;
            }else{
                decision = true;
            }

        }while(decision);

    }
}
