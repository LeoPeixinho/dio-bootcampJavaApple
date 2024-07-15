package Functions;
import java.util.Scanner;

public class Telephone{
	
	public static void dial() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gostaria de realizar uma ligação?");
		String decision = sc.nextLine().toUpperCase(); 
		if (decision.equals("SIM")) {
			System.out.println("Digite o número");
			String dialNumber = sc.next();
			try {
				long number = Long.parseLong(dialNumber);
				System.out.println("Você está ligando para: " + number );

			} catch (NumberFormatException e){
				System.out.println("Número discado inválido, tente novamente!");
			}
			
		} else {
			answer();
		}
		
	}
	
	public static void answer () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Alguém está ligando......");
		System.out.println("Atender: Sim ou Não?");
		String decision = sc.nextLine().toUpperCase();
		if (decision.equals("SIM")) {
			System.out.println("Você atendeu a ligação");
		} else {
			
			System.out.println("Ligação Recusada");
			System.out.println("Recado adicionado no seu correio de voz!");	
			voiceMail();
		}  
	}
	
	private static void voiceMail() {
		Scanner sc = new Scanner (System.in);
		String  [] message = { "Desconhecido" , "Steve" , "Hiley"};
		System.out.println("Correio de Voz pendente. Digite o número que deseja ouvir: ");
		for (int i = 0; i < message.length; i++) {
			System.out.println((i+1) + "." + message[i]);
			}	
			int choice = sc.nextInt();
				if (choice > 0 && choice <= message.length) {
					System.out.println("Ouvindo: " + message[choice -1]);
				} else {
					System.out.println("Opção inválida");
					voiceMail();
				}
		
	}
}

