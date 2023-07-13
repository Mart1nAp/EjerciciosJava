import java.util.Scanner;

public class EjercicioExtra8 {

/*    8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
   detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
    y la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int contPares =0;
        int contaImpares= 0;

        do {
            System.out.println("Ingrese un numero entero: ");
            numero = leer.nextInt();
            if (numero % 2 == 0 && numero > 0){
                contPares += 1;
            } else{
                contaImpares += 1;
            }
        } while (numero % 5 != 0 && numero > 0);

        System.out.println("Hay : "+contPares+" numeros pares.");
        System.out.println("Hay : "+contaImpares+" numeros impares.");

    }
}
