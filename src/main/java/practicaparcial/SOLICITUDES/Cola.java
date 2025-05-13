package practicaparcial.SOLICITUDES;

public class Cola implements ICola {

    private NodoSolicitud primero;
    private NodoSolicitud actual;
    private int size;

    public Cola() {
        this.primero = null;
        this.actual = null;
        this.size = 0;
    }
}
