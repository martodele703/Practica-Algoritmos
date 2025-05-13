package practicaparcial.SOLICITUDES;

public interface ICola {
    
    void encolar(Object item);

    Object desencolar();

    Object peek();

    String mostrar();
    
    int size();
}
