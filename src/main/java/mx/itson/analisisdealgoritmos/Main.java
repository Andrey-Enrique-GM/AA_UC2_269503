
package mx.itson.analisisdealgoritmos;

// @author Andrey

public class Main 
{
    
    
    public static void main(String[] args) {
        
        int[] arreglo = {10, 4, 24, 3, 8, 12};
        
        System.out.println("Arreglo original:");
        
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        
        System.out.println("\n");
        
        Ordenamientos.burbuja(arreglo);
        
        System.out.println("Arreglo ordenado:");
        
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        
    }
    
    
}
