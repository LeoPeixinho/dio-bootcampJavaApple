package Functions;
import java.util.Scanner;
public class Safari {	
	
	
	public static void browse() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Buscar ou digitar nome do site: ");
		String website = sc.nextLine();
		System.out.println("Voce está conectado a página https://www." + website + ".com");
	}
	
	public static void uptadePage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gostaria de atualizar página atual? ");
		String decision = sc.nextLine().toUpperCase();
		if(decision.equals("SIM")) {
			System.out.println("Página atualizada com sucesso!!!");
		} else {
			System.out.println("Página não atualizada!");
		}
	}	
	public static void newPage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gostaria de adicionar uma nova aba? ");
		String decision = sc.nextLine().toUpperCase();
		if (decision.equals("SIM")) {
			browse();
		} else {
			System.out.println("Você permaneceu na aba atual");
		}
	}
}
