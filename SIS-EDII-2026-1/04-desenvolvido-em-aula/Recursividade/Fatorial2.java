package recursividade;

public class Fatorial2 {

	static int fat(int n) {
		int f = 1;

		while (n > 0) {
			f = f * n;
			n = n - 1;
		}
		return f;
	}

	public static void main(String[] args) {
		int resultado = fat(4);
		System.out.println(resultado);

	}

}

//f = 1

//f = 1 * 4 = 4   (n = 3)
//f = 4 * 3 = 12  (n = 2)
//f = 12 * 2 = 24 (n = 1)
//f = 24 * 1 = 24 (n = 0)

//para e retorna 24




