package listaDinamica;

public class ListaEncadeadaSimples {
	
	//PRIMEIRO VAMOS CONSTRUIR A ESTRUTURA DE UM NÓ
    //No é uma classe interna, só pode ser usado dentro de ListaEncadeadaSimples
	class No {
        String dado;
        No prox;

        //construtor
        public No(String dado) {
        	//o atributo dado do objeto recebe o valor do parâmetro dado
            this.dado = dado;
            //o atributo prox do objeto recebe null
            this.prox = null;
        }
    }
    
    //criando a estrutura da lista
    private No primeiro;
    private No ultimo;

    //construtor da lista
    public ListaEncadeadaSimples() {
        primeiro = null;
        ultimo = null;
    }
    
    //paramos aqui<<<<<<<<<<<<

    //verificar se a lista está vazia, pois se o priomeiro for null, significa que ainda não existe nenhum nó na lista
    public boolean vazia() {
        return primeiro == null;
    }

    
    //inserir um novo nó no inicio
    public void inserirInicio(String valor) {

    	//primeiro cria um novo, já coloca o valor, e o prox fica como null.
        No novo = new No(valor);

        //depois testa se a lista está vazia
        if (vazia()) {
        	//se nao existe nenhum elemento, então tanto o primeiro quanto o último, é o mesmo que foi criado. 
            primeiro = novo;
            ultimo = novo;
            
        //se já existe algo na lsita    
        } else {
        	// o próximo do novo será o "primeiro" (o que estava em primeiro)
            novo.prox = primeiro;
            // atualizar o primeiro, agora o primeiro passa a ser o novo.
            primeiro = novo;
        }
    }

    
    //para inserir no final da lista
    public void inserirFinal(String valor) {

    	//cria o novo, já coloca o valor, e o prox fica como null.
        No novo = new No(valor);

        //depois testa se a lista está vazia
        if (vazia()) {
        	//se nao existe nenhum elemento, então tanto o primeiro quanto o último, é o mesmo que foi criado. 
            primeiro = novo;
            ultimo = novo;
        
        //se já tema lgo na lista, o prox do ultimo recebe o novo
        } else {
            //se já tema lgo na lista, o prox do ultimo recebe o novo
            ultimo.prox = novo;
            //o ultimo recebe o novo
            ultimo = novo;
        }
    }

    
    
    public String removerInicio() {

        if (vazia()) {
            return null;
        }
        
        //cria uma variável VALOR e coloca nela o dado do primeiro nó
        String valor = primeiro.dado;

        //verifica se existe apenas um elemento
        if (primeiro == ultimo) {
        	//coloca null tanto no primeiro quanto no ultimo e a lista fica vazia
            primeiro = null;
            ultimo = null;
        } else {
        	//primeiro passa a ser o prox do primeiro (primeiro.prox)
            primeiro = primeiro.prox;
        }
        // só retorna o valor removido, pois foi salvo em VALOR antes de remover
        return valor;
    }

    
    public void imprimir() {

        No atual = primeiro;

        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.prox;
        }
    }
	
	
	
	public static void main(String[] args) {
		//crioar um objeto da lista (tipo da variavel, variável, cria a lista)
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();

        lista.inserirInicio("A");
        lista.inserirInicio("B");
        lista.inserirFinal("C");
        
        System.out.println("Lista inicial: ");
        lista.imprimir();

        
        System.out.println("\nRemovendo do início...");
        String removido = lista.removerInicio();
        System.out.println("Removido: " + removido);

        System.out.println("\nLista após remoção:");
        lista.imprimir();

	}

}
