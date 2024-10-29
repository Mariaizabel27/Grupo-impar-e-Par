//Desenvolvido por:Maria e Camila
import java.util.Scanner;
public class Caixa_Eletronico {
public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor que você deseja sacar: ");
		int valor = scanner.nextInt();

		if (valor % 2 != 0) {
			System.out.println("Valor informado inválido. O valor deve ser múltiplo de 2.");
		} else {

			int[] notas = { 100, 50, 20, 10, 2 };
			int[] quantidadeNotas = new int[5];

			System.out.println("Quantidade de notas para realizar o saque:");
			for (int i = 0; i < 4; i++) {
				quantidadeNotas[i] = valor / notas[i];
				valor %= notas[i];

				System.out.println("Notas de " + notas[i] + ": " + quantidadeNotas[i]);
			}

			quantidadeNotas[4] = valor / 2;
			valor %= 2;

			System.out.println("Notas de 5: 0");

			System.out.println("Notas de 2: " + quantidadeNotas[4]);
		}

		scanner.close();
	}

}
