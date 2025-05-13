package practicaparcial.TRIE;

import java.util.List;

public interface ITrie {

    boolean insertar(String nombre);

    boolean buscar(String nombre);

    List<String> empiezaCon(String prefijo);

    boolean eliminar(String nombre);
}
