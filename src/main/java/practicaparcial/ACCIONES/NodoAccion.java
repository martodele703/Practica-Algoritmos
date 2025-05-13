package practicaparcial.ACCIONES;

public class NodoAccion {
    enum TipoAccion {
        PAJA,
        MEAR,
        COMER,
        DORMIR
    }

    private TipoAccion Accion;
    private NodoAccion siguiente;    
}
