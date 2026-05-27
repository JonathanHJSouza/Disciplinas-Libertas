package arvore;

 /* Regra de inserção:
 *   - valores menores vão para a subárvore esquerda
 *   - valores maiores vão para a subárvore direita*/
public class ArvoreBinaria {

    private No raiz;   // referência para o nó raiz da árvore

    //Construtor: cria uma árvore vazia.
    
    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Insere uma informação na árvore

    public void inserir(int info) {
        raiz = inserirNo(raiz, info);
    }

    /* Método auxiliar recursivo para inserção.
     * Percorre a árvore até encontrar a posição correta.*/
    private No inserirNo(No noAtual, int info) {
        // posição vazia encontrada: cria e retorna o novo nó
        if (noAtual == null) {
            return new No(info);
        }

        if (info < noAtual.info) {
            // informação menor: desce pela subárvore esquerda
            noAtual.esq = inserirNo(noAtual.esq, info);
        } else if (info > noAtual.info) {
            // informação maior: desce pela subárvore direita
            noAtual.dir = inserirNo(noAtual.dir, info);
        }
        // se info == noAtual.info: ignora (sem duplicatas)

        return noAtual;
    }

    /* Pesquisa uma informação na árvore.
     * Retorna verdadeiro se encontrada, falso caso contrário.*/
    public boolean pesquisar(int info) {
        return pesquisarNo(raiz, info);
    }

    // Método auxiliar recursivo para pesquisa.
    private boolean pesquisarNo(No noAtual, int info) {
        // árvore vazia ou informação não encontrada
        if (noAtual == null) {
            return false;
        }

        if (info == noAtual.info) {
            return true;                          // encontrou
        } else if (info < noAtual.info) {
            return pesquisarNo(noAtual.esq, info); // pesquisa à esquerda
        } else {
            return pesquisarNo(noAtual.dir, info); // pesquisa à direita
        }
    }

    // CAMINHAMENTO EM ORDEM (esquerda → raiz → direita)
    //Imprime os nós da árvore em ordem crescente.
    public void imprimirEmOrdem() {
        System.out.print("Em ordem: ");
        caminhamentoEmOrdem(raiz);
        System.out.println();
    }

    //Método auxiliar recursivo para caminhamento em ordem.

    private void caminhamentoEmOrdem(No noAtual) {
        if (noAtual != null) {
            caminhamentoEmOrdem(noAtual.esq);          // visita subárvore esquerda
            System.out.print(noAtual.info + "  ");     // visita o nó
            caminhamentoEmOrdem(noAtual.dir);          // visita subárvore direita
        }
    }
}