import java.util.Scanner;

public class EjercicioExtra14 {

/*    14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
    cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias;
        int hijos;
        int edad = 0;
        int cont = 0;
        int cont1 = 1;
        int contHijos = 0;
        int edadTotal = 0;

        System.out.println("Ingrese la cantidad de familias: ");
        familias = leer.nextInt();

        for (int i = 0;i < familias;i++){
            System.out.println("Ingrese el numero de hijos de la familia "+cont1+ ":");
            hijos = leer.nextInt();
            cont += hijos;
            cont1 += 1;
            for (int j = 1;j<= hijos;j++){
                System.out.println("ingrese la edad del hijo #" +j);
                edad = leer.nextInt();
                edadTotal += edad;
                contHijos += 1;
            }
        }
        //System.out.println(cont+ "estos esta es la edad totalizada: "+edadTotal );
        System.out.println("El numero de total de hijos es: "+contHijos+", y la edad promedio es: "+ (edadTotal/cont));
    }

}
