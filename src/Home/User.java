package Home;

import java.util.Scanner;

import Functions.Home;
import Functions.ITunes;
import Functions.Safari;
import Functions.Telephone;
import Functions.ProcessComand;
public class User {
	public static void main (String[]args) {
		
		Home home = new Home();
		home.getName();
		home.toString();
		ProcessComand.start(null);
		ProcessComand.off();

	}

}
	
	