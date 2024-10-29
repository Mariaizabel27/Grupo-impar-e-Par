import java.util.Scanner;
public class exercicio_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) {
			if (i % 2 != 0) {
				resultado *= i;
			}
			
		}
		System.out.print("A multiplicação do numeros são " + resultado );
		
	}

}
