package recursividade;

public class Fibonacci2 {
//Não recursivo
	static int fibIter(int n) {
		int i = 1, F = 0;
		for (int k = 1; k <= n; k++) {
			F = F + i;
			i = F - i;
		}
		return F;
	}

	public static void main(String[] args) {
		int resultado = fibIter(6);
		System.out.println(resultado);
	}

}
