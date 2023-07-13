import java.util.Scanner;

public class EjercicioExtra7 {

/*    7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
    promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
    números serán introducidos por el usuario. Realice dos versiones del programa, una
    usando el bucle “while” y otra con el bucle “do - while”.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int maximo = 0;
        int minimo = 1;
        int promedio = 0;


        System.out.println("Ingrese el numero de valores a ingresar: ");
        n = leer.nextInt();

        //operacionWhile(n,maximo,minimo,promedio,leer);
        operacionDo(n,maximo,minimo,promedio,leer);
    }

    public static void operacionWhile(int n, int maximo, int minimo, int promedio, Scanner leer) {
        int contador = 1;
        int numero = 0;

        if (n>0){
            System.out.println("Ingrese el valor #" +contador +": ");
            numero = leer.nextInt();
            contador += 1;
            minimo = numero;

            while (contador <= n){
                System.out.println("Ingrese el valor #" +contador +": ");
                numero = leer.nextInt();
                promedio += numero;
                contador += 1;

                if (numero>maximo){
                    maximo = numero;
                }
                if (numero < minimo){
                    minimo = numero;
                }
            }
        }else {
            System.out.println("NUmero negativo.");
        }

        System.out.println("El numero maximo ingresado es: "+maximo);
        System.out.println("El numero minimo ingresado es: "+minimo);
        System.out.println("El promedio de los numeros ingresados es: "+(promedio/n));


    }

    public static void operacionDo(int n, int maximo, int minimo, int promedio, Scanner leer) {
        int contador = 1;
        int numero = 0;

        if (n>0){
            System.out.println("Ingrese el valor #" +contador +": ");
            numero = leer.nextInt();
            contador += 1;
            minimo = numero;

            do {
                System.out.println("Ingrese el valor #" +contador +": ");
                numero = leer.nextInt();
                promedio += numero;
                contador += 1;


                if (numero>maximo){
                    maximo = numero;
                }
                if (numero <= minimo){
                    minimo = numero;
                }
            }while (contador <= n);
        }else {
            System.out.println("NUmero negativo.");
        }

        System.out.println("El numero maximo ingresado es: "+maximo);
        System.out.println("El numero minimo ingresado es: "+minimo);
        System.out.println("El promedio de los numeros ingresados es: "+(promedio/n));


    }
}

