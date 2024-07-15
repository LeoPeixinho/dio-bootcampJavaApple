package Functions;
import Home.User;
import java.util.Scanner;

public class ProcessComand {
	
	public static void off () {
		
	Scanner sc = new Scanner(System.in);
	boolean off = true;
	
	while(off) {
		System.out.println("Digite 'Sair' para desligar ");
		System.out.println("Caso queira continuar aproveitando seu Iphone digite 'Prosseguir'");

		String input = sc.nextLine().toUpperCase();
	    if(input.equalsIgnoreCase("SAIR")) {
	    	off = false;
	    	System.out.println("Iphone desligando...");
	    } else {
	    	start(input);
	    }
	}
}

	public static void start(String input) {
		String[] app = { "ITunes", "Safari", "Telefone", "Sair"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione a ação desejada: ");
			for (int i = 0; i < app.length ; i++) {
				System.out.println((i + 1) + "." + app[i]);
		}
				String appEscolhido = sc.nextLine();
				if(appEscolhido.equals("1")) {
					System.out.println("Você está no ITunes");
					ITunes.changeMusic();
					ITunes.pauseMusic();
				} else if (appEscolhido.equals("2")) {
					System.out.println("Você está no Safari");
					Safari.browse();
					Safari.uptadePage();
					Safari.newPage();
				} else if (appEscolhido.equals("3")) {
					System.out.println("Você está no Telephone");
					Telephone.dial();
					Telephone.answer();
				} else if (appEscolhido.equals("4")){
					System.out.println("Tem certeza que gostaria de encerrar seu Iphone?");
					
				} else {
					System.out.println("Opção inválida, tente novamente!");
					start(input);
				}
		
	}
	
}