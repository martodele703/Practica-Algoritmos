package practicaparcial.JUGADOR;

import practicaparcial.ACCIONES.Pila;
import practicaparcial.SOLICITUDES.Cola;

public class Jugador {
    private String nombre;
    private int puntaje;
    private Pila acciones;
    private Cola solicitudes;    

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.acciones = new Pila();
        this.solicitudes = new Cola();
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }
}
