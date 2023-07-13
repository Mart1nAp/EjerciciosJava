import javax.swing.*;
import java.util.Scanner;

public class EjercicioExtra21 {

/*    21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
    desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
    trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
    programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
    desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
    igual al 7 de sus notas del curso.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] notas = new double[10];

    validacion(notas,leer);
    impresion(notas);
    aprobo(notas);
    }

    public static void validacion(double[] notas, Scanner leer) {
        double trabajoPractico1 = 0;
        double trabajoPractico2 = 0;
        double parcial1 = 0;
        double parcial2 = 0;

        for (int i = 0; i < 10;i++){
            for (int j = 0; j < 1;j++){
                System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo():");
                trabajoPractico1 = leer.nextDouble();
                System.out.println("Ingrese la nota del Segundo trabajo práctico evaluativo:");
                trabajoPractico2 = leer.nextDouble();
                System.out.println("Ingrese la nota del Primer Integrador: ");
                parcial1 = leer.nextDouble();
                System.out.println("Ingrese la nota del Segundo Integrador: ");
                parcial2 = leer.nextDouble();
                notas[i] = ((trabajoPractico1*0.1)+(trabajoPractico2*0.15)+(parcial1*0.25)+(parcial2*0.5));
            }
        }
    }

    public static void impresion(double[]notas) {
        for (int i = 0; i<10; i++){
            System.out.print(notas[i]+" ");
        }
        System.out.println("");
    }

    public static void aprobo(double[]notas) {
        int alumno = 1;
        for (int i = 0;i<10;i++){
            if (notas[i]>=7.0){
                System.out.println("El alumno #"+alumno+" aprobo");
                alumno += 1;
            }else {
                System.out.println("El alumno #"+alumno+" desaprobo");
                alumno += 1;
            }
        }
    }
}
