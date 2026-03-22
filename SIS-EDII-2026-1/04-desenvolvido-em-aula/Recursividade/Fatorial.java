package recursividade;

public class Fatorial {

	static int fat1(int n) {
		int r;
		if (n <= 0) {
			r = 1;
		} else {
			r = n * fat1(n - 1);
		}
		return r;
	}

	static int fat2(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return n * fat2(n - 1);
		}
	}

	public static void main(String[] args) {
		int f;

		f = fat1(4);
		System.out.println(f);

		f = fat2(4);
		System.out.println(f);

	}

}

//fat1(4)
//= 4 * fat1(3)
//= 4 * (3 * fat1(2))
//= 4 * (3 * (2 * fat1(1)))
//= 4 * (3 * (2 * (1 * fat1(0))))
//= 4 * 3 * 2 * 1 * 1
//= 24
