package practicaparcial.JUGADOR;

import practicaparcial.ACCIONES.Pila;
import practicaparcial.SOLICITUDES.Cola;

public class Jugador implements IJugador {
    // variables de jugador
    private String nombre;
    private int puntaje;
    private Pila acciones;
    private Cola solicitudes;

    // variables de nodo
    private Jugador hijoDerecho;
    private Jugador hijoIzquierdo;
    private int nivel;
    

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.acciones = new Pila();
        this.solicitudes = new Cola();
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }
}
