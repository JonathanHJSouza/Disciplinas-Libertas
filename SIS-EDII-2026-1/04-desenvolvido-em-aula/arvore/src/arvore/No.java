package arvore;

/**
 * Classe que representa um nó da árvore binária.
 * Cada nó armazena uma informação e referências
 * para os nós filho à esquerda e à direita.
 */

public class No {

    public int info; // informação armazenada no nó
    public No esq;   // referência para o filho esquerda
    public No dir;   // referência para o filho direita

    /**
     * Construtor: cria um nó com a informação recebida.
     * Os filhos começam como nulos (nó folha).
     */
    
    public No(int info) {
        this.info = info;
        this.esq  = null;
        this.dir  = null;
    }
}