import java.util.Scanner;

public class Pedra {

	// Placar
	private static int placarJogador = 0;
	private static int placarComputador = 0;
	// Escolhas dos jogadores
	private static int escolhaJogador;
	int pedra = 1, papel = 2, tesoura = 3;
	private static int escolhaComputador;

	// Principal
	public static void main(String[] args) {
		int reiniciar = 0;
		// Quantidade de rodadas
		int rodadas = 0;
		do {
		Scanner input1 = new Scanner(System.in);
		System.out.println("---JOKENPO---");
		System.out.println("Ola jogador, deseja jogar quantas rodadas?");
		rodadas = input1.nextInt(); // Input de rodadas
		// Reiniciar o jogo 
		for (int i = 1; i <= rodadas; ++i) {
			escolhaComputador = (int) (Math.random() * 3) + 1;
			rotuloEscolhaJogador();
			escolhaJogador = input1.nextInt(); // Reutilizando input
			verificaResultado(); // M�todo
		}
		exibePlacar();
		}
		while (reiniciar == 1);{
		
			System.out.println("Deseja jogar novamente?");
			System.out.println("(1) SIM (0) NAO");
			Scanner input2 = new Scanner(System.in);
			reiniciar = input2.nextInt();
			if( reiniciar == 0 ){
				System.out.println("--FIM--");
			}
		}
		}
	
	// Verifica resultado
	public static void verificaResultado() {
		if (escolhaComputador == escolhaJogador) {
			System.out.println("Deu Empate!");
		} else {
			if ((escolhaJogador == 1 && escolhaComputador == 3) || (escolhaJogador == 2 && escolhaComputador == 1)
					|| (escolhaJogador == 3 && escolhaComputador == 2)) {
				System.out.println("JOGADOR GANHOU!");
				placarJogador++;
			} else {
				System.out.println("COMPUTADOR GANHOU!");
				placarComputador++;
			}
		}
	}

	// Campara��es, if, else, sysout, ++placarJogador
	

	// Exibir o placar
	public static void exibePlacar() {
		System.out.println("|Placar do Jogador: " + placarJogador);
		System.out.println("|Placar do Computador: " + placarComputador);
		if (placarJogador > placarComputador) {
			System.out.println("Jogador Ganhou!");
		} else if (placarJogador < placarComputador) {
			System.out.println("Computador Ganhou!");
		}
		// sysout e chamar a vari�vel do placar

	}

	// Rotulo jogador
	public static void rotuloEscolhaJogador() {
		System.out.println("---JOGADOR, INSIRA:");
		System.out.println("--- 1 - Pedra");
		System.out.println("--- 2 - Papel");
		System.out.println("--- 3 - Tesoura");
		System.out.println("--- Escolha sua op��o: ");
	}

}
