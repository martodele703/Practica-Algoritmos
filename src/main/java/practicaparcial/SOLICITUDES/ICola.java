package practicaparcial.SOLICITUDES;

/**
 * Interfaz que define las operaciones básicas de una cola de solicitudes(NodoSolicitud).
 * (estructura FIFO - First In, First Out).
 */
public interface ICola {

    /**
     * Agrega un elemento al final de la cola.
     *
     * @param item el elemento que se desea agregar a la cola
     */
    void encolar(Object item);

    /**
     * Elimina y devuelve el primer elemento de la cola.
     *
     * @return el primer elemento de la cola, o {@code null} si la cola está vacía
     */
    Object desencolar();

    /**
     * Devuelve el primer elemento de la cola sin eliminarlo.
     *
     * @return el primer elemento de la cola, o {@code null} si la cola está vacía
     */
    Object peek();

    /**
     * Devuelve una representación en cadena de los elementos de la cola.
     *
     * @return una cadena con los elementos de la cola, generalmente desde el frente hacia el final
     */
    String mostrar();

    /**
     * Devuelve la cantidad de elementos actualmente en la cola.
     *
     * @return el número de elementos en la cola
     */
    int size();
}

