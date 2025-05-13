package practicaparcial.JUGADOR;

import practicaparcial.ACCIONES.Pila;
import practicaparcial.SOLICITUDES.Cola;

public class Jugador implements IJugador {
    private String nombre;
    private int puntaje;
    private Pila acciones;
    private Cola solicitudes;
    private Jugador hijoDerecho;
    private Jugador hijoIzquierdo;

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.acciones = new Pila();
        this.solicitudes = new Cola();
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }
}
