import java.util.Scanner;

public class EjercicioExtra1 {

/*    1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos;

        System.out.println("Ingrese el numero de minutos a calcular: ");
        minutos = leer.nextInt();

        calculo(minutos);
    }

    public static void calculo(int minutos) {
    int dia;
    int horas;
    int horasRestantes;

    horas = (minutos / 60);

    dia = (horas / 24);
    horasRestantes = (horas % 24);
    if (dia == 1 && horasRestantes == 1) {
        System.out.println("su equivalente: " + dia + " día, " + horasRestantes + " hora.");
    }
    if (dia > 1 && horasRestantes == 1) {
        System.out.println("su equivalente: " + dia + " días, " + horasRestantes + " hora.");
    }
    if (dia == 1 && horasRestantes > 1) {
        System.out.println("su equivalente: " + dia + " día, " + horasRestantes + " horas.");
    }
    if (dia > 1 && horasRestantes > 1) {
        System.out.println("su equivalente: " + dia + " días, " + horasRestantes + " horas.");
    }

}
}
