package practicaparcial.JUGADOR;

import java.util.ArrayList;
import java.util.List;

public class NodoJugadores implements INodoJugadores {

    private List<Jugador> jugadores;
    private Jugador hijoDerecho;
    private Jugador hijoIzquierdo;
    private int nivel;

    public NodoJugadores() {
        this.jugadores = new ArrayList<>();
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.nivel = 0;
    }


}
