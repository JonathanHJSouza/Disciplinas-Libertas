public class ArvoreBinaria {

    protected No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int info) {
        raiz = inserirNo(raiz, info);
    }

    private No inserirNo(No no, int info) {
        if (no == null) {
            return new No(info);
        }
        if (info < no.info) {
            no.esquerdo = inserirNo(no.esquerdo, info);
        } else if (info > no.info) {
            no.direito = inserirNo(no.direito, info);
        }
        return no;
    }

    public boolean estaVazia() {
        return raiz == null;
    }
}
