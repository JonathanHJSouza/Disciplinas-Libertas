package arvore;

// Classe principal para teste da Árvore Binária de Pesquisa.
public class Programa {

    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        // inserindo informações na árvore
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        // imprimindo em ordem
        arvore.imprimirEmOrdem();

        // pesquisando informações
        System.out.println("Pesquisa 40: " + arvore.pesquisar(40));  // true
        System.out.println("Pesquisa 99: " + arvore.pesquisar(99));  // false
    }
}