//Desenvolvido por:Maria Izabel e Camila 
import java.util.Scanner;
public class Pares {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		int soma = 0;

		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}

		System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

		scanner.close();

	}

}
