
package mx.itson.analisisdealgoritmos;

// @author Andrey

public class Ordenamientos 
{
    
    
    public static void burbuja(int[] arreglo) {

        int n = arreglo.length; // tamaño del arreglo

        for (int i = 0; i < n - 1; i++) {          // ciclo exterior
            for (int j = 0; j < n - i - 1; j++) {  // ciclo interior

                if (arreglo[j] > arreglo[j + 1]) { // comparacion

                    int aux = arreglo[j];          // intercambio
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Complejidad aproximada: O(n^2)
    }
    
    
}
