import java.util.Scanner;

public class Ejercicio12 {

/*    12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
    ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
    distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
    ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
    distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;

        int longuitud;
        int contador1 = 0;
        int contador2 = -1;
        int psFinal;
        boolean val;

        do {
            System.out.println("Ingrese una frase: ");
            frase = leer.nextLine();

            longuitud = frase.length();
            psFinal = frase.length() - 1;

            if (frase.substring(0, 1).equals("X") && frase.substring(psFinal).equals("O") && longuitud <= 5) {
                contador1 += 1;
            } else {
                contador2 += 1;
            }
//            val = frase.equals("&&&&&");
//            System.out.println(val);

        } while (!(frase.equals("&&&&&")));

        System.out.println("El numero de frases correctas es: " + contador1 + " y incorrectas: " + contador2);
    }
}

