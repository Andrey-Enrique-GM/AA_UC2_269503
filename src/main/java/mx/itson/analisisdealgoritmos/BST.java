
package mx.itson.analisisdealgoritmos;

// @author Andrey

public class BST 
{
    
    // Clase interna para representar cada nodo del arbol
    class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        public Nodo(int item) {
            valor = item;
            izquierdo = derecho = null;
        }
    }

    // Raiz principal del arbol
    Nodo raiz;

    public BST() {
        raiz = null;
    }

    // --- A. INSERCION ---
    // Inserta un nuevo valor en el arbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    // --- B. BUSQUEDA ---
    // Busca un valor y retorna true si existe, false en caso contrario
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor) != null;
    }

    private Nodo buscarRecursivo(Nodo actual, int valor) {
        if (actual == null || actual.valor == valor) {
            return actual;
        }
        if (valor < actual.valor) {
            return buscarRecursivo(actual.izquierdo, valor);
        }
        return buscarRecursivo(actual.derecho, valor);
    }

    // --- C. ELIMINACION ---
    // Elimina un nodo del arbol
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return null;
        }

        if (valor < actual.valor) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = eliminarRecursivo(actual.derecho, valor);
        } else {
            // Nodo con un solo hijo o sin hijos
            if (actual.izquierdo == null) {
                return actual.derecho;
            } else if (actual.derecho == null) {
                return actual.izquierdo;
            }

            // Nodo con dos hijos: se obtiene el sucesor inorden (el menor en el subarbol derecho)
            actual.valor = encontrarMinimo(actual.derecho);

            // Se elimina el sucesor inorden
            actual.derecho = eliminarRecursivo(actual.derecho, actual.valor);
        }
        return actual;
    }

    private int encontrarMinimo(Nodo raiz) {
        int minimo = raiz.valor;
        while (raiz.izquierdo != null) {
            minimo = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minimo;
    }

    // --- D. RECORRIDO INORDEN ---
    // Imprime los elementos en orden ascendente
    public void recorridoInorden() {
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(Nodo actual) {
        if (actual != null) {
            inordenRecursivo(actual.izquierdo);
            System.out.print(actual.valor + " ");
            inordenRecursivo(actual.derecho);
        }
    }
    
}
