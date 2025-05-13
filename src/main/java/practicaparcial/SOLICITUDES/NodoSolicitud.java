package practicaparcial.SOLICITUDES;

public class NodoSolicitud {
    enum TipoSolicitud {
        PAJA,
        MEAR,
        COMER,
        DORMIR
    }

    private TipoSolicitud solicitud;
    private NodoSolicitud siguiente;

    public NodoSolicitud(TipoSolicitud solicitud) {
        this.solicitud = solicitud;
    }

    public TipoSolicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(TipoSolicitud solicitud) {
        this.solicitud = solicitud;
    }
}
