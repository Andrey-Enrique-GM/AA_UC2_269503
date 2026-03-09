
package mx.itson.analisisdealgoritmos;

// @author Andrey

import java.util.Scanner;


public class Main 
{
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] arregloOriginal = {10, 4, 24, 3, 8, 12};

        System.out.println("Arreglo original:");

        for (int num : arregloOriginal) {
            System.out.print(num + ", ");
        }

        System.out.println("\n");
        System.out.println("Seleccione el algoritmo de ordenamiento:");
        System.out.println("1.- Burbuja");
        System.out.println("2.- Seleccion");

        int opcion = scanner.nextInt();

        // clonamos el arreglo para no modificar el original
        int[] arreglo = arregloOriginal.clone();

        if (opcion == 1) {
            System.out.println("\nUsando ordenamiento Burbuja\n");
            Ordenamientos.burbuja(arreglo);
        }
        else if (opcion == 2) {
            System.out.println("\nUsando ordenamiento por Seleccion\n");
            Ordenamientos.seleccion(arreglo);
        } 
        else {
            System.out.println("Opcion no valida");
            return;
        }

        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        
    }
    
    
}
