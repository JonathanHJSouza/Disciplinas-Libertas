public class PreOrdem extends ArvoreBinaria {

    public void percorrer() {
        if (estaVazia()) {
            System.out.println("Arvore vazia.");
            return;
        }
        percorrerPreOrdem(raiz);
    }

    private void percorrerPreOrdem(No no) {
        if (no != null) {
            System.out.print(no.info + " ");
            percorrerPreOrdem(no.esquerdo);
            percorrerPreOrdem(no.direito);
        }
    }
}
