package practicaparcial.ARBOL;

import practicaparcial.ACCIONES.Pila;
import practicaparcial.JUGADOR.Jugador;
import practicaparcial.SOLICITUDES.Cola;

public interface IArbol {
    
    boolean insertar(Jugador jugadorNuevo);

    boolean eliminar(Jugador eliminado);

    boolean buscar(Jugador jugador);

    String imprimirPreOrden();

    String impreimirInOrden();

    String imprimirPostOrden();

    int cantidadJugadores();

    int contarNodosPorNivel(int nivel);


    boolean agregarAccion(int puntaje, String accion);

    void agregarSolicitud(int puntaje, String solicitud);

    String obtenerNombre(int puntaje);

    int obtenerPuntaje();

    Pila obtenerAcciones(int puntaje);

    Cola obtenerSolicitudes(int puntaje);

    Jugador obtenerHijoDerecho(int puntaje);

    Jugador obtenerHijoIzquierdo(int puntaje);

    void establecerHijoDerecho(int puntaje, Jugador hijoDerecho);

    void establecerHijoIzquierdo(int puntaje, Jugador hijoIzquierdo);
}
