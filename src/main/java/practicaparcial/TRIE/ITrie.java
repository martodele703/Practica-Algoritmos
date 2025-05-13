package practicaparcial.TRIE;

import java.util.List;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas de un Trie (árbol de prefijos).
 * Utilizado para almacenar cadenas y realizar búsquedas eficientes por nombre o prefijo.
 */
public interface ITrie {

    /**
     * Inserta una nueva cadena (nombre) en el trie.
     *
     * @param nombre la cadena que se desea insertar
     * @return {@code true} si la inserción fue exitosa, {@code false} si el nombre ya existía
     */
    boolean insertar(String nombre);

    /**
     * Busca una cadena completa en el trie.
     *
     * @param nombre la cadena a buscar
     * @return {@code true} si el nombre existe en el trie, {@code false} en caso contrario
     */
    boolean buscar(String nombre);

    /**
     * Devuelve una lista de todas las cadenas almacenadas en el trie que comienzan con el prefijo dado.
     *
     * @param prefijo el prefijo con el que deben comenzar las cadenas
     * @return una lista de cadenas que comienzan con el prefijo especificado
     */
    List<String> empiezaCon(String prefijo);

    /**
     * Elimina una cadena del trie.
     *
     * @param nombre la cadena que se desea eliminar
     * @return {@code true} si la cadena fue eliminada, {@code false} si no existía
     */
    boolean eliminar(String nombre);
}
