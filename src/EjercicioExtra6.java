import java.util.Scanner;

public class EjercicioExtra6 {

/*    6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
    por debajo de 1.60 mts. y el promedio de estaturas en general.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int estatura = 0;
        int contador = 0;
        int promedio = 0;

        System.out.println("Ingrese el numero de personas a ingresar: ");
        n = leer.nextInt();

        operacion(n, estatura,contador,promedio,leer);

    }

    public static void operacion(int n,int estatura,int contador,int promedio, Scanner leer) {

        for (int i = 1; i <= n; i++){
            System.out.println("Ingrese la estatura de la persona " +i+ " en cm: ");
            estatura = leer.nextInt();
            promedio += estatura;
            if (estatura <= 160){
                contador += 1;
            }
        }

        System.out.println("El numero de personas con estatura menor a 160 cm es: "+contador);
        System.out.println("El promedio de altura de las "+n+" personas es: "+(promedio/n)+" cm.");

    }
}
