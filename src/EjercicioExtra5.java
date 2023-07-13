import java.util.Scanner;

public class EjercicioExtra5 {

/*    5. Una obra social tiene tres clases de socios:
    - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    - Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
    para los mismos tratamientos que los socios del tipo A.
    - Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tipo;
        int costo;

        System.out.println("Ingrese el tipo de socio (A,B,C): ");
        tipo = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento: ");
        costo = leer.nextInt();

        operacion(tipo,costo);

    }

    public static void operacion(String tipo, int costo) {

        switch (tipo.toUpperCase()){
            case "A":
                System.out.println("El socio es tipo "+tipo.toUpperCase()+ ", el costo después del descuento es: "+(costo*0.5));
                break;
            case "B":
                System.out.println("El socio es tipo "+tipo.toUpperCase()+ ", el costo después del descuento es: "+(costo*0.65));
                break;
            case "C":
                System.out.println("El socio es tipo "+tipo.toUpperCase()+ ", el costo es: "+(costo));
                break;
            default:
                System.out.println("Tipo de socio no valido.");
        }

    }
}
