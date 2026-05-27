public class EmOrdem extends ArvoreBinaria {

    public void percorrer() {
        if (estaVazia()) {
            System.out.println("Arvore vazia.");
            return;
        }
        percorrerEmOrdem(raiz);
    }

    private void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.esquerdo);
            System.out.print(no.info + " ");
            percorrerEmOrdem(no.direito);
        }
    }
}
