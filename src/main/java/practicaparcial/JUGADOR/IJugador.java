package practicaparcial.JUGADOR;

import practicaparcial.ACCIONES.Pila;
import practicaparcial.ARBOL.IArbol;
import practicaparcial.SOLICITUDES.Cola;

/**
 * Interfaz que define las operaciones de un jugador.
 * Contiene los mismos metodos que arbol, la implementacion es distinta.
 */
public interface IJugador extends IArbol {
    
    /**
     * Inserta un nuevo jugador en el árbol.
     *
     * @param jugadorNuevo el jugador que se desea insertar
     * @return {@code true} si el jugador fue insertado correctamente, {@code false} en caso contrario
     */
    boolean insertar(Jugador jugadorNuevo);

    /**
     * Elimina un jugador del árbol.
     *
     * @param eliminado el jugador que se desea eliminar
     * @return {@code true} si el jugador fue eliminado, {@code false} si no se encontró
     */
    boolean eliminar(Jugador eliminado);

    /**
     * Busca un jugador en el árbol en base a su puntaje.
     *
     * @param puntaje el puntaje que se desea buscar
     * @returnel jugador si el jugador fue encontrado, {@code null} en caso contrario
     */
    Jugador buscar(int puntaje);

    /**
     * Devuelve una representación en cadena del recorrido en preorden del árbol.
     *
     * @return una cadena con los jugadores en preorden
     */
    String imprimirPreOrden();

    /**
     * Devuelve una representación en cadena del recorrido en inorden del árbol.
     *
     * @return una cadena con los jugadores en inorden
     */
    String impreimirInOrden(); // Nótese el error ortográfico: "impreimir" debería ser "imprimir"

    /**
     * Devuelve una representación en cadena del recorrido en postorden del árbol.
     *
     * @return una cadena con los jugadores en postorden
     */
    String imprimirPostOrden();

    /**
     * Devuelve la cantidad total de jugadores (nodos) en el árbol.
     *
     * @return el número total de jugadores en el árbol
     */
    int cantidadJugadores();

    /**
     * Cuenta la cantidad de nodos (jugadores) en un nivel específico del árbol.
     *
     * @param nivel el nivel del árbol que se desea contar (0 para la raíz)
     * @return la cantidad de nodos en el nivel indicado
     */
    int contarNodosPorNivel(int nivel);

    /**
     * Agrega una acción al historial del jugador con el puntaje indicado.
     *
     * @param puntaje el puntaje del jugador al que se le agregará la acción
     * @param accion la acción a registrar
     * @return {@code true} si la acción fue agregada, {@code false} si no se encontró el jugador
     */
    boolean agregarAccion(int puntaje, String accion);

    /**
     * Agrega una solicitud al jugador con el puntaje indicado.
     *
     * @param puntaje el puntaje del jugador
     * @param solicitud la solicitud que se desea agregar
     */
    void agregarSolicitud(int puntaje, String solicitud);

    /**
     * Obtiene el nombre del jugador con el puntaje especificado.
     *
     * @param puntaje el puntaje del jugador
     * @return el nombre del jugador, o {@code null} si no se encontró
     */
    String obtenerNombre(int puntaje);

    /**
     * Obtiene el puntaje de la raíz del árbol o de otro nodo relevante según la implementación.
     *
     * @return el puntaje correspondiente
     */
    int obtenerPuntaje();

    /**
     * Obtiene la pila de acciones del jugador con el puntaje especificado.
     *
     * @param puntaje el puntaje del jugador
     * @return la pila de acciones del jugador, o {@code null} si no se encontró
     */
    Pila obtenerAcciones(int puntaje);

    /**
     * Obtiene la cola de solicitudes del jugador con el puntaje especificado.
     *
     * @param puntaje el puntaje del jugador
     * @return la cola de solicitudes del jugador, o {@code null} si no se encontró
     */
    Cola obtenerSolicitudes(int puntaje);

    /**
     * Obtiene el hijo derecho del jugador con el puntaje indicado.
     *
     * @param puntaje el puntaje del jugador
     * @return el jugador que es hijo derecho, o {@code null} si no existe
     */
    Jugador obtenerHijoDerecho(int puntaje);

    /**
     * Obtiene el hijo izquierdo del jugador con el puntaje indicado.
     *
     * @param puntaje el puntaje del jugador
     * @return el jugador que es hijo izquierdo, o {@code null} si no existe
     */
    Jugador obtenerHijoIzquierdo(int puntaje);

    /**
     * Establece el hijo derecho de un jugador identificado por su puntaje.
     *
     * @param puntaje el puntaje del jugador padre
     * @param hijoDerecho el jugador que será asignado como hijo derecho
     */
    void establecerHijoDerecho(int puntaje, Jugador hijoDerecho);

    /**
     * Establece el hijo izquierdo de un jugador identificado por su puntaje.
     *
     * @param puntaje el puntaje del jugador padre
     * @param hijoIzquierdo el jugador que será asignado como hijo izquierdo
     */
    void establecerHijoIzquierdo(int puntaje, Jugador hijoIzquierdo);
}
