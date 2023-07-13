import java.util.Scanner;

public class Ejercicio17 {

 /*   17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();

        int[] vector = new int[n];

        //Llenado del vector, se llena de 1 a 30.
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 30000) + 1;
            System.out.println(vector[i]);
        }

        int digitos;
        int conta1 = 0;
        int conta2 = 0;
        int conta3 = 0;
        int conta4 = 0;
        int conta5 = 0;

        for (int i = 0; i < n; i++) {
            digitos = Integer.toString(vector[i]).length();

            switch (digitos) {
                case 1:
                    conta1 += 1;
                    break;
                case 2:
                    conta2 += 1;
                    break;
                case 3:
                    conta3 += 1;
                    break;
                case 4:
                    conta4 += 1;
                    break;
                case 5:
                    conta5 += 1;
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("El # de numeros con 1 digito es: " + conta1);
        System.out.println("El # de numeros con 2 digitos es:" + conta2);
        System.out.println("El # de numeros con 3 digitos es: " + conta3);
        System.out.println("El # de numeros con 4 digitos es: " + conta4);
        System.out.println("El # de numeros con 5 digitos es: " + conta5);
    }
}
