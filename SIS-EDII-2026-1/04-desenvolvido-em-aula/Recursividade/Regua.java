package recursividade;

public class Regua {
	static void regua(int l, int r, int h) {
		//ainda tenho marca para desenhar?. Se a altura chegou a zero, não há mais nada a fazer e a tarefa termina. Esse é a saida da recursão
		if (h > 0) {
			//Calcula o meio do trecho atual. 
			//Se estou olhando de 0 até 16, o meio é 8. 
			//Se estou olhando de 0 até 8, o meio é 4. Sempre divide ao meio.
			int m = (l + r) / 2;

			//Cria uma marca nessa posição do meio. Quanto maior o h, maior a marca
			marca(m, h);

			//RECURSÃO, agora faz a mesma coisa, mas só no lado esquerdo, e com uma marca menor
			//Ela não continua daqui enquanto não terminar tudo do lado esquerdo. 
			//Tudo. Até o último pedacinho.
			regua(l, m, h - 1);
			
			//Só depois de terminar o lado esquerdo inteiro, começa o lado direito.
			//Mesma ideia, mesma tarefa, metade menor, marca menor.
			regua(m, r, h - 1);
		}
	}

	static void marca(int pos, int h) {
		//só imprime uma linha na tela
		System.out.println("Marca em " + pos + " altura " + h);
	}

	public static void main(String[] args) {
		//desenha a régua do 0 ao 16, começando com marcas de altura 4
		regua(0, 16, 4);
	}

}


//A tarefa olha para um trecho, marca o meio, 
//depois pede para ela mesma fazer a mesma coisa nas duas metades
//até não sobrar mais nada para marcar.
