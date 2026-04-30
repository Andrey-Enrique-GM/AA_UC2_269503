
package mx.itson.analisisdealgoritmos;

// @author Andrey

import java.util.Scanner;


public class Main 
{
    
    
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        int[] arregloOriginal = {10, 4, 24, 3, 8, 12};

        System.out.println("\n");
        System.out.println("Seleccione el algoritmo de ordenamiento:");
        System.out.println("1.- Burbuja");
        System.out.println("2.- Seleccion");
        System.out.println("3.- Insercion");
        System.out.println("4.- Quicksort");
        System.out.println("5.- Mergesort");
        System.out.println("6.- Ejecutar Practica BST");
        
        int opcion = scanner.nextInt();
        
        if (opcion >= 1 && opcion <= 5) {
            // clonamos el arreglo para no modificar el original
            int[] arreglo = arregloOriginal.clone();

            switch (opcion) {
                case 1:
                    Ordenamientos.burbuja(arreglo);
                    break;
                case 2:
                    Ordenamientos.seleccion(arreglo);
                    break;
                case 3:
                    Ordenamientos.insercion(arreglo);
                    break;
                case 4:
                    Ordenamientos.quicksort(arreglo);
                    break;
                case 5:
                    Ordenamientos.mergeSort(arreglo);
                    break;
            }

            System.out.println("\nArreglo original:");
            for (int num : arregloOriginal) {
                System.out.print(num + ", ");
            }
            
            System.out.println("\n\nArreglo ordenado:");
            for (int num : arreglo) {
                System.out.print(num + ", ");
            }
            System.out.println();
            
        } else if (opcion == 6) {
            // Ejecucion del arbol de busqueda binaria
            BST arbol = new BST();
            
            // a. Inserte los siguientes valores en el arbol uno por uno: 50, 30, 70, 20, 40, 60, 80
            int[] valoresAInserir = {50, 30, 70, 20, 40, 60, 80};
            for (int v : valoresAInserir) {
                arbol.insertar(v);
            }
            
            // b. Imprima el recorrido inorden antes de eliminar
            System.out.print("Recorrido inorden (antes de eliminar): ");
            arbol.recorridoInorden();
            
            // c. Elimine el nodo con valor 50, y explique su implementacion
            // Explicacion: Para eliminar el 50 (nodo con dos hijos), se busca su sucesor inorden 
            // (el menor valor del subárbol derecho, que es 60). Se reemplaza el valor del nodo 
            // con 60 y luego se elimina recursivamente el nodo duplicado en el subárbol derecho.
            arbol.eliminar(50);
            System.out.println("Se elimino el nodo con valor 50 utilizando el sucesor inorden (60).");
            
            // d. Imprima el recorrido inorden despues de la eliminacion
            System.out.print("Recorrido inorden (despues de eliminar): ");
            arbol.recorridoInorden();
            
            // e. Realice busquedas para los valores: 30, 50, 60
            int[] valoresABuscar = {30, 50, 60};
            for (int v : valoresABuscar) {
                if (arbol.buscar(v)) {
                    System.out.println("Valor " + v + " encontrado.");
                } else {
                    System.out.println("Valor " + v + " no encontrado.");
                }
            }
            
        } else {
            System.out.println("Opcion no valida");
        }
        
        scanner.close();
        
    }
    
    
}
