import java.util.Scanner;

public class EjercicioExtra24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int m = 0;
        int n = 1;
        int x;

        System.out.println("Ingrese el numero de veces que desea se ejecute: ");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            x = m + n;
            m = n;
            n = x;
            System.out.print(x + " ");
        }
    }
}
