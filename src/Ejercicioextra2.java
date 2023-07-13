public class Ejercicioextra2 {

/*    2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
    C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/

    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int auxiliar = 0;

        System.out.println("Este es el valor de A:"+A);
        System.out.println("Este es el valor de B:"+B);
        System.out.println("Este es el valor de C:"+C);
        System.out.println("Este es el valor de D:"+D);
        System.out.println(" ");

        operacion(A,B,C,D,auxiliar);
    }

    public static void operacion(int A,int B,int C, int D, int auxiliar) {

        auxiliar = B;
        B = C;
        C = A;
        A = D;
        D= auxiliar;


        System.out.println("Este es el valor de A:"+A);
        System.out.println("Este es el valor de B:"+B);
        System.out.println("Este es el valor de C:"+C);
        System.out.println("Este es el valor de D:"+D);



    }
}
