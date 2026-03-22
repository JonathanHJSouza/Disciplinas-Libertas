package matriz;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz1 = new int[2][2];
		
		matriz1[0][0] = 1;
		matriz1[0][1] = 2;
		matriz1[1][0] = 3;
		matriz1[1][1] = 4;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matriz1[i][j]);
			}
		}
				
	}

}
