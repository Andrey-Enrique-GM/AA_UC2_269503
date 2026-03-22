
package mx.itson.analisisdealgoritmos;

// @author Andrey

public class Ordenamientos 
{
    
    
    // ===      ORDENAMIENTO BURBUJA         ==============================================
    public static void burbuja(int[] arreglo) {

        int n = arreglo.length; // tamaño del arreglo
        // 1 operacion : asignacion

        for (int i = 0; i < n - 1; i++) {          // ciclo exterior
        // 1 asignacion inicial
        // (n-1) comparaciones
        // (n-1) incrementos
        // El ciclo exterior se ejecuta (n-1) veces
        
            for (int j = 0; j < n - i - 1; j++) {  // ciclo interior
            // 1 asignacion inicial
            // comparaciones dependientes de n
            // incrementos dependientes de n
            // Total de comparaciones del algoritmo:
            // (n-1) + (n-2) + ... + 1 = n(n-1)/2

                if (arreglo[j] > arreglo[j + 1]) { // comparacion
                // 1 comparacion entre elementos

                    int aux = arreglo[j];          // intercambio
                    // 1 asignacion
                    arreglo[j] = arreglo[j + 1];
                    // 1 asignacion
                    arreglo[j + 1] = aux;
                    // 1 asignacion
                }
            }
        }
        /*
        Total de comparaciones:
        n(n-1)/2

        Número maximo de intercambios:
        n(n-1)/2

        Expresion aproximada del algoritmo:
        T(n) = an^2 + bn + c

        Complejidad temporal:
        O(n^2)
        */
    }
    
    
    
    // ===      ORDENAMIENTO POR SELECCION         ========================================
    public static void seleccion(int[] arreglo) {

        int n = arreglo. length;
        // 1 operacion : asignacion
        
        for (int i = 0; i < n - 1; i++){
        // 1 asignacion inicial
        // (n-1) comparaciones
        // (n-1) incrementos
        // El ciclo exterior se ejecuta (n-1) veces
        
            int indiceMinimo = i;
            // 1 asignacion
            
            for (int j = i + 1; j < n; j++){
            // 1 asignacion inicial
            // comparaciones dependientes de n
            // incrementos dependientes de n
                
                if (arreglo[j] < arreglo[indiceMinimo]){
                // comparacion entre elementos
                    indiceMinimo = j;
                    // 1 asinacion
                }
            } 
            int aux = arreglo[indiceMinimo];
            // 1 asignacion
            arreglo[indiceMinimo] = arreglo[i];
            // 1 asignacion
            arreglo[i] = aux;
            // 1 asignacion
        }
        /*
        Total de comparaciones:
        n(n-1)/2

        Numero maximo de intercambios:
        n-1

        Expresion aproximada del algoritmo:
        T(n) = an^2 + bn + c

        Complejidad temporal:
        O(n^2)
        */        
    }
    
    
    
    // ===      ORDENAMIENTO POR INSERCION         =========================================
    public static void insercion(int[] arreglo) {

        int n = arreglo.length; // tamaño del arreglo
        // 1 operacion

        for (int i = 1; i < n; i++) { // ciclo exterior
        // Este ciclo se ejecuta (n-1) veces

            int clave = arreglo[i];
            // asignacion

            int j = i - 1;
            // asignacion

            while (j >= 0 && arreglo[j] > clave) { 
            // comparacion entre elementos

                arreglo[j + 1] = arreglo[j];
                // asignacion (desplazamiento)
                
                j = j - 1;
                // asignacion
            }
            
            arreglo[j + 1] = clave;
            // asignacion (insercion del elemento)
        }

        /*
            Total de comparaciones:
            (n-1) + (n-2) + ... + 1

            Resultado:
            n(n-1)/2

            Número maximo de desplazamientos:
            n(n-1)/2

            Expresion aproximada del algoritmo:
            T(n) = an^2 + bn + c

            Complejidad temporal:
            O(n^2)
            */
    }
    
    
    
    // ===      ORDENAMIENTO RAPIDO (QUICKSORT)         =========================================
    public static void quicksort(int[] arreglo) {
        if (arreglo == null || arreglo.length <= 1) {
            return; // Si el arreglo está vacío o tiene un elemento, ya está ordenado
        }
        quicksortRecursivo(arreglo, 0, arreglo.length - 1);
        
        /*
        Complejidad temporal (Caso Promedio / Mejor caso): 
        O(n log n) - El pivote divide el arreglo en mitades proporcionales.
        
        Complejidad temporal (Peor caso): 
        O(n^2) - Ocurre si el pivote siempre es el elemento mayor o menor.
        */
    }

    // eétodo recursivo privado
    private static void quicksortRecursivo(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivoteIndice = particion(arr, inicio, fin);
            quicksortRecursivo(arr, inicio, pivoteIndice - 1);
            quicksortRecursivo(arr, pivoteIndice + 1, fin);
        }
    }

    // Metodo de particion privado
    private static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin]; 
        arr[fin] = temp;

        return i + 1;
    }
    
    
}
