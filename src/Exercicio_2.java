import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numeroEscolhido;
        int tentativas = 7;

     
        System.out.print("Jogador 1, escolha um número entre 1 e 100: ");
        numeroEscolhido = scanner.nextInt();
        
      
        while (numeroEscolhido < 1 || numeroEscolhido > 100) {
            System.out.print("Número inválido! Escolha um número entre 1 e 100: ");
            numeroEscolhido = scanner.nextInt();
        }

      
        System.out.println("\n".repeat(50)); 

    
        boolean acertou = false;
        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + " de " + tentativas + ". Jogador 2, tente adivinhar o número: ");
            int palpite = scanner.nextInt();
        
            
            if (palpite == numeroEscolhido) {
            	
            	acertou = true;
            	System.out.println("Parabens, voce acertou o número em " + i + " tentativas");
            	break;
            	
            }else if (palpite < numeroEscolhido ) {
            	System.out.println("O número é maior que " + palpite + ".");
            }else {
            	System.out.println("O número é menor que " + palpite + ".");
            }
            
	}



	if (!acertou) {
		System.out.println(" Que pena! voce esgotou suas tentativas. O número era: " + numeroEscolhido + ".");
	}
}
}

