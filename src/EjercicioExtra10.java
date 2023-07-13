import java.util.Scanner;

public class EjercicioExtra10 {
/*    10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.*/

    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;

    llenado(n1,n2,leer);

    }

    public static void llenado(int n1, int n2, Scanner leer) {
        int numero;
        int resul;

        n1 = (int) (Math.random()*10)+1;
        n2 = (int) (Math.random()*10)+1;
        System.out.println(+n1+ "," +n2);
        resul = n1 * n2;

        do {
            System.out.println("Ingrese el numero que cree es el resultado: ");
            numero = leer.nextInt();
        }while (resul != numero);
        System.out.println("Numero correcto.");
    }
}
