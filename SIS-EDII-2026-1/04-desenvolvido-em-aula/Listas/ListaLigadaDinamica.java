package listaDinamica;

public class ListaLigadaDinamica {

	public class No {
		private String dado;
		private No prox;

		// Propriedades da classe
		public No getProx() {
			return this.prox;
		}

		public void setProx(No prox) {
			this.prox = prox;
		}

		public String getDado() {
			return this.dado;
		}

		// Construtor da classe No
		public No(String dadonovo) {
			dado = dadonovo;
			prox = null;
		}

		public No(String dadonovo, No ligacao) {
			dado = dadonovo;
			prox = ligacao;
		}
	}

	private No primeiro;
	private No ultimo;
	private String nomeDaLista;

	// Construtor da classe Lista
	public ListaLigadaDinamica(String nome) {
		nomeDaLista = nome;
		// Como a lista inicialmente é vazia, tanto o primeiro como o ultimo receberão o
		// valor nulo.
		primeiro = ultimo = null;
	}

	public ListaLigadaDinamica() {
		nomeDaLista = "Lista Teste";
		primeiro = ultimo = null;
	}

	public void InsereNaFrente(String item) {
		// Verifica se a lista está vazia. Se estiver, o primeiro e o ultimo receberão o
		// nó que está sendo criado.
		if (Vazia())
			primeiro = ultimo = new No(item);
		// Quando a lista não está vazia o primeiro recebe o nó criado e seu “prox”
		// recebe o”antigo” primeiro.
		else
			primeiro = new No(item, primeiro);
	}

	public void InsereNoFundo(String item) {
		if (Vazia())
			primeiro = ultimo = new No(item);
		else {
			ultimo.setProx(new No(item));
			ultimo = ultimo.getProx();
		}
	}

	public String RemoveDaFrente() {
		// Verifica se está vazia, s e sim, não faz nada e retorna nulo.
		if (Vazia()) {
			return null;
		}
		String item = primeiro.getDado();
		// Verifica se o primeiro é igual ao ultimo, se sim, existe apenas um elemento
		// na lista. Atribui o valor nulo para ambos.
		if (primeiro == ultimo)
			primeiro = ultimo = null;
		// Caso contrário, atribui o endereço do segundo nó à variavel primeiro.
		else
			primeiro = primeiro.getProx();
		return item;
	}

	public String RemoveDoFundo() {
		if (Vazia()) {
			return null;
		}
		String item = ultimo.getDado();
		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else {
			No atual = primeiro;
			while (atual.getProx() != ultimo)
				atual = atual.getProx();
			ultimo = atual;
			atual.setProx(null);
		}
		return item;
	}

	public boolean Vazia() {
		// Se a variável primeiro é nula, então a lista não possui elementos (nós), ela
		// está vazia
		return primeiro == null;
	}

	public String EscreveLista() {
		String temp = "";
		if (Vazia()) {
			temp += "Vazia " + nomeDaLista;
			return temp;
		} // if vazia
		temp += "A " + nomeDaLista + " contem \n\n";
		No atual = primeiro;
		while (atual != null) {
			temp += atual.getDado() + ", ";
			atual = atual.getProx();
		}
		temp += "\n";
		return temp;
	}

	public String exibePrim() {
		if (primeiro == null)
			return "Primeiro: null";
		else
			return "Primeiro: " + primeiro.getDado();
	}

	public String exibeUlt() {
		if (ultimo == null)
			return "Ultimo: null";
		else
			return "Ultimo: " + ultimo.getDado();

	}

	public static void main(String[] args) {
		ListaLigadaDinamica l1 = new ListaLigadaDinamica();
		l1.InsereNaFrente("no1");
		l1.InsereNaFrente("no2");
		l1.InsereNoFundo("no3");
		System.out.print(l1.EscreveLista());
		l1.RemoveDaFrente();
		l1.RemoveDoFundo();
		System.out.print(l1.EscreveLista());
	}

}
