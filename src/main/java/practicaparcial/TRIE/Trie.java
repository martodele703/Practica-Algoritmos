package practicaparcial.TRIE;

public class Trie implements ITrie {

    private static final int letrasAbecedario = 26;
    private NodoTrie[] letras;


    public Trie() {
        this.letras = new NodoTrie[letrasAbecedario];
    }
}
