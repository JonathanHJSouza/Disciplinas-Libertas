public class Principal {

    public static void main(String[] args) {

        int[] valores = { 4, 2, 6, 1, 3, 5, 7 };

        PreOrdem preOrdem = new PreOrdem();
        EmOrdem emOrdem = new EmOrdem();
        PosOrdem posOrdem = new PosOrdem();

        for (int v : valores) {
            preOrdem.inserir(v);
            emOrdem.inserir(v);
            posOrdem.inserir(v);
        }

        System.out.print("Pre-ordem:  ");
        preOrdem.percorrer();
        System.out.println();

        System.out.print("Em ordem:   ");
        emOrdem.percorrer();
        System.out.println();

        System.out.print("Pos-ordem:  ");
        posOrdem.percorrer();
        System.out.println();
    }
}
