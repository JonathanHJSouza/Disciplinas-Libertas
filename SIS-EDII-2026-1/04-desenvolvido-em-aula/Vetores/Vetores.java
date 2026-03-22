package vetores;

public class Vetores {

	public static void main(String[] args) {
		// primeira parte:
		String[] nomes; // Declaração simples de um vetor chamado “nomes” que armazenará elementos do tipo “string”.
		
		// segunda parte:
		nomes = new String[3]; // Criada uma instância do vetor nomes informando que ele possuirá 3 posições.
				
		//Esta declaração poderá ser realizada em uma única linha:
		//String[] nomes = new String[3];

		nomes[0] = "Maria";
		nomes[1] = "Carlos";
		nomes[2] = "Ana";
		
		String nome = nomes[2];
		System.out.println(nome);
		
		//nomes[2] = "";
		//nome = nomes[2];
		//System.out.println(nome);
		
		for (int i = 0; i < nomes.length; i++)
			System.out.print(nomes[i]);

		for (int i = 0; i < nomes.length; i++ )
			if(nomes[i].toString() == "Carlos")
			System.out.print("O nome Carlos está na	posição: " + i);
		
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
