public class PosOrdem extends ArvoreBinaria {

    public void percorrer() {
        if (estaVazia()) {
            System.out.println("Arvore vazia.");
            return;
        }
        percorrerPosOrdem(raiz);
    }

    private void percorrerPosOrdem(No no) {
        if (no != null) {
            percorrerPosOrdem(no.esquerdo);
            percorrerPosOrdem(no.direito);
            System.out.print(no.info + " ");
        }
    }
}
