package telaOrdenacao;

import javax.swing.*;   
import java.awt.*;  
import java.util.Random;

public class TelaOrdenacao extends JFrame {

 private JTextArea campoEntrada; 
 private JTextArea campoSaida;   
 private JLabel labelTempo;

 public TelaOrdenacao() {

     setTitle("Laboratório de Algoritmos de Ordenação");    
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(520, 420);
     setLocationRelativeTo(null);

     
     setLayout(new BorderLayout(10, 10));

     // JPanel é um container invisível que agrupa componentes. BorderLayout(5, 5) com espaços menores para os elementos internos
     JPanel painelEntrada = new JPanel(new BorderLayout(5, 5));

     // createTitledBorder cria uma borda com texto ao redor do painel, aparece como um retângulo com o título na parte superior
     painelEntrada.setBorder(BorderFactory.createTitledBorder("Entrada (números separados por vírgula)"));

     // JTextArea é uma área de texto com múltiplas linhas
     // 3 = número de linhas visíveis, 30 = número de colunas (largura aproximada)
     campoEntrada = new JTextArea(3, 30);

     // Faz o texto "quebrar" automaticamente ao atingir a largura do componente
     campoEntrada.setLineWrap(true);

     // Define a fonte: Monospaced (espaçamento fixo), estilo normal, tamanho 14
     campoEntrada.setFont(new Font("Monospaced", Font.PLAIN, 14));

     // JScrollPane adiciona barras de rolagem ao JTextArea
     // Se o texto for maior que a área visível, aparece a barra de rolagem
     painelEntrada.add(new JScrollPane(campoEntrada), BorderLayout.CENTER);

     // Botão para gerar números aleatórios automaticamente
     JButton btnAleatorio = new JButton("Gerar 20 aleatórios");

     // addActionListener define O QUE ACONTECE quando o botão é clicado.
     // Significa: quando clicar, chame o método gerarAleatorio passando 20
     btnAleatorio.addActionListener(e -> gerarAleatorio(20));

     // Adiciona o botão na parte inferior (SOUTH) do painel de entrada
     painelEntrada.add(btnAleatorio, BorderLayout.SOUTH);

     JPanel painelBotoes = new JPanel(new GridLayout(1, 3, 8, 0));
     // GridLayout(1, 3, 8, 0): 1 linha, 3 colunas, 8px de espaço horizontal, 0 vertical
     // Os 3 botões ficam lado a lado com tamanho igual

     painelBotoes.setBorder(BorderFactory.createTitledBorder("Algoritmo"));

     // Cria os três botões
     JButton btnBubble    = new JButton("Bubble Sort");
     JButton btnSelection = new JButton("Selection Sort");
     JButton btnInsertion = new JButton("Insertion Sort");

     // Cada botão chama o método executar() passando qual algoritmo usar
     btnBubble.addActionListener(e    -> executar("bubble"));
     btnSelection.addActionListener(e -> executar("selection"));
     btnInsertion.addActionListener(e -> executar("insertion"));

     painelBotoes.add(btnBubble);
     painelBotoes.add(btnSelection);
     painelBotoes.add(btnInsertion);

     
     // PAINEL DE SAÍDA 
     JPanel painelSaida = new JPanel(new BorderLayout(5, 5));
     painelSaida.setBorder(BorderFactory.createTitledBorder("Resultado"));

     // Área de texto para exibir o resultado (não pode ser editada pelo usuário)
     campoSaida = new JTextArea(4, 30);
     campoSaida.setEditable(false); // Somente leitura
     campoSaida.setLineWrap(true);
     campoSaida.setFont(new Font("Monospaced", Font.PLAIN, 14));
     painelSaida.add(new JScrollPane(campoSaida), BorderLayout.CENTER);

     // JLabel é um componente de texto simples (não editável, sem rolagem)
     // Usado aqui para exibir o tempo de execução
     labelTempo = new JLabel("Tempo: —");
     labelTempo.setFont(new Font("SansSerif", Font.BOLD, 13));

     // createEmptyBorder cria uma borda invisível que funciona como espaçamento interno (top=4, left=4, bottom=4, right=4 em pixels)
     labelTempo.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
     painelSaida.add(labelTempo, BorderLayout.SOUTH);

     //MONTAGEM FINAL DA JANELA 
     // Cria um painel central que agrupa os três painéis criados acima
     JPanel centro = new JPanel(new BorderLayout(10, 10));

     // createEmptyBorder aqui serve como margem interna da janela toda (10px em cada lado)
     centro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

     // Posiciona os três painéis dentro do painel central
     centro.add(painelEntrada, BorderLayout.NORTH);   // Topo
     centro.add(painelBotoes, BorderLayout.CENTER);   // Meio
     centro.add(painelSaida, BorderLayout.SOUTH);     // Base

     // Adiciona o painel central na janela principal (JFrame)
     add(centro, BorderLayout.CENTER);

     // Torna a janela visível — sem isso ela existe mas não aparece na tela
     setVisible(true);
 }

 // lerVetor() — lê e converte a entrada do usuário em int[]
 // a String digitada pelo usuário em um vetor de inteiros
 // String "8,5,1,9,2"  →  split(",")  →  String[] {"8","5","1","9","2"}
 //                     →  parseInt()  →  int[] {8, 5, 1, 9, 2}
 // ─────────────────────────────────────────────────────────────────────────
 private int[] lerVetor() {

     // getText() pega o texto digitado no JTextArea
     // trim() remove espaços extras no começo e no fim
     String texto = campoEntrada.getText().trim();

     // Verifica se o campo está vazio
     if (texto.isEmpty()) {
         // JOptionPane.showMessageDialog exibe uma janela pop-up de aviso
         // "this" = a janela pai (TelaOrdenacao), null = centralizar na tela
         JOptionPane.showMessageDialog(this, "Digite os números no campo de entrada.");
         return null; // Retorna null para indicar que deu erro
     }

     // try-catch captura erros em tempo de execução
     // Se o usuário digitar algo que não é número, parseInt lança uma exceção
     try {
         // split(",") divide a String em um vetor de Strings usando vírgula como separador
         String[] partes = texto.split(",");

         // Cria o vetor de inteiros com o mesmo tamanho
         int[] vetor = new int[partes.length];

         // Percorre cada String e converte para inteiro
         for (int i = 0; i < partes.length; i++) {
             // trim() remove espaços extras ao redor de cada número
             // parseInt converte a String para int
             vetor[i] = Integer.parseInt(partes[i].trim());
         }

         return vetor; // Retorna o vetor preenchido

     } catch (NumberFormatException ex) {
         // Erro de formato: usuário digitou algo que não é número
         JOptionPane.showMessageDialog(this,
             "Entrada inválida. Use apenas números separados por vírgula.\nExemplo: 8,5,1,9,2");
         return null;
     }
 }

 // executar() — chamado quando qualquer botão de algoritmo é clicado
 // Recebe o nome do algoritmo, chama a classe correspondente, mede o tempo
 // e exibe o resultado na interface
 private void executar(String algoritmo) {

     // Lê o vetor da entrada, se retornar null, para aqui
     int[] vetor = lerVetor();
     if (vetor == null) return;

     long tempo; // Variável para guardar o tempo retornado pelo algoritmo

     // switch escolhe qual classe chamar baseado no botão clicado
     switch (algoritmo) {
         case "bubble":
             // Chama o método estático da classe BubbleSort
             // O método ordena o vetor e retorna o tempo em nanossegundos
             tempo = BubbleSort.ordenar(vetor);
             break;
         case "selection":
             tempo = SelectionSort.ordenar(vetor);
             break;
         case "insertion":
             tempo = InsertionSort.ordenar(vetor);
             break;
         default:
             return;
     }

     // Monta o texto de saída
     // StringBuilder é mais eficiente que concatenar Strings em laço
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < vetor.length; i++) {
         sb.append(vetor[i]);
         if (i < vetor.length - 1) sb.append(", "); // vírgula entre os números, exceto o último
     }

     // Exibe o vetor ordenado no campo de saída
     campoSaida.setText(sb.toString());

     // Exibe o tempo em nanossegundos E em milissegundos
     // 1_000_000.0: divisor para converter ns → ms (o _ é só separador visual, igual a 1000000)
     labelTempo.setText("Tempo: " + tempo + " ns  (" + (tempo / 1_000_000.0) + " ms)");
 }

 // gerarAleatorio() — preenche o campo de entrada com números aleatórios
 private void gerarAleatorio(int quantidade) {
     Random rand = new Random();
     StringBuilder sb = new StringBuilder();

     for (int i = 0; i < quantidade; i++) {
         sb.append(rand.nextInt(1000)); // Número entre 0 e 999
         if (i < quantidade - 1) sb.append(",");
     }

     // Define o texto no campo de entrada com os números gerados
     campoEntrada.setText(sb.toString());
 }

 // SwingUtilities.invokeLater garante que a janela seja criada
 public static void main(String[] args) {
     SwingUtilities.invokeLater(TelaOrdenacao::new);
 }
}