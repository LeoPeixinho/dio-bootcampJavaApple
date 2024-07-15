package Functions;
import java.util.Scanner;

public class ITunes {

	
	private static String[] songs = {"Take on me - A-HA","Can't Stop - Red Hot", "7 Years - Lukas Graham"};
	
	private static void showOption(){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < songs.length; i++ ) {
			System.out.println((i + 1) + "." + songs[i]);
		}
		int choice = sc.nextInt();
		if (choice > 0 && choice <= songs.length) {
			System.out.println("Tocando: " + songs[choice -1]);
		} else {
			System.out.println("Escolha inválida, tente novamente");
			showOption();
		}	
	}
	
	public static void changeMusic (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da música desejada:");
		showOption();
	}
	
	public static void pauseMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gostaria de pausar a música?");
		String decision = sc.nextLine().toUpperCase();
			if(decision.equals("SIM")) {
				System.out.println("A música está pausada");
			} else {
				System.out.println("A música está tocando");
			}
	}
}
