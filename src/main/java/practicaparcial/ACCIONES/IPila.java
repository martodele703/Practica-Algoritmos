package practicaparcial.ACCIONES;

/**
 * Interfaz que define las operaciones básicas de una pila de acciones(NodoAccion) 
 * (estructura LIFO - Last In, First Out).
 */
public interface IPila {

    /**
     * Inserta un elemento en la parte superior de la pila.
     *
     * @param item el elemento que se desea agregar a la pila
     */
    void push(Object item);

    /**
     * Elimina y devuelve el elemento que se encuentra en la parte superior de la pila.
     *
     * @return el elemento en la cima de la pila, o {@code null} si la pila está vacía
     */
    NodoAccion pop();

    /**
     * Devuelve el elemento que se encuentra en la parte superior de la pila sin eliminarlo.
     *
     * @return el elemento en la cima de la pila, o {@code null} si la pila está vacía
     */
    NodoAccion peek();

    /**
     * Devuelve una representación en cadena de los elementos de la pila.
     * 
     * @return una cadena con los elementos de la pila, generalmente de arriba hacia abajo
     */
    String mostrar();

    /**
     * Devuelve la cantidad de elementos actualmente en la pila.
     *
     * @return el número de elementos en la pila
     */
    int size();
}
