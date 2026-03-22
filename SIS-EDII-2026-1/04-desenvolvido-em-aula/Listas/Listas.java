package listas;

//classe principal
public class Listas {
	//atributos
	private int[] valores;
	//private String[] valores2;
	private int tamanho;

	//construtor
	public Listas(int tam) {
		if (tam > 0) {
			tamanho = tam;
			valores = new int[tamanho];
			//valores2 = new String[tamanho];
		}
	}

	//metodos
	public int insere(int valor, int pos) {
		if (pos >= 0 && pos < valores.length) {
			valores[pos] = valor;
			return valor;
		} else
			return -1;
	}

	public int remove(int pos) {
		int valor;
		if (pos > 0 && pos < valores.length) {
			valor = valores[pos];
			valores[pos] = 0;
			return valor;
		} else
			return -1;
	}
	
	public void consulta(int valor) {
	for (int i = 0; i < valores.length; i++ )
		if(valores[i] == valor)
		System.out.print("O valor está no índice: " + i);
	}

	//main
	public static void main(String[] args) {
		Listas l1 = new Listas(5);
		l1.insere(1, 0);
		l1.insere(2, 1);
		System.out.println(l1.valores[1]);
		l1.consulta(1);
	}
}