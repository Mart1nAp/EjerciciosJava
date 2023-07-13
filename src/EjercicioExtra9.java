import java.util.Scanner;

public class EjercicioExtra9 {

/*    9. Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
            Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
    este resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:

            50 – 13 = 37 una resta realizada
            37 – 13 = 24 dos restas realizadas
            24 – 13 = 11 tres restas realizadas

    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
            ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dividendo;
        int divisor;

        System.out.println("Ingrese el dividendo: ");
        dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor: ");
        divisor = leer.nextInt();

        //operacion(dividendo,divisor);
        operacionDo(dividendo,divisor);
    }

    public static void operacion(int dividendo,int divisor) {
        int contador = 0;
        int producto;

        producto = (dividendo-divisor);
        contador += 1;
        System.out.println(+dividendo+ " / "+divisor+ " = "+producto+ ", "+ contador + " resta realizada");

        while (producto>divisor){
            dividendo = producto;
            producto = dividendo - divisor;
            contador += 1;
            System.out.println(+dividendo+ " / "+divisor+ " = "+producto+ ", "+ contador + " resta realizada");
        }

        System.out.println("dado que "+producto+  " es menor que " +divisor+ " entonces: el residuo es " +producto+ " y el cociente es " +contador);

    }

    public static void operacionDo(int dividendo,int divisor) {
        int contador = 0;
        int producto;

        do {
            producto = (dividendo - divisor);
            contador += 1;
            System.out.println(+dividendo + " / " + divisor + " = " + producto + ", " + contador + " resta realizada");
            dividendo = producto;

        }while (producto>divisor);

        System.out.println("dado que "+producto+  " es menor que " +divisor+ " entonces: el residuo es " +producto+ " y el cociente es " +contador);

    }
}
