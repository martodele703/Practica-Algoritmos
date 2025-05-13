package practicaparcial.TRIE;

public class NodoTrie {

    private static final int letrasAbecedario = 26;
    NodoTrie[] hijos;
    Character etiqueta;
    boolean esPalabra;

    public NodoTrie() {
        this.etiqueta = null;
        this.hijos = new NodoTrie[letrasAbecedario];
        this.esPalabra = false;
    }
}


