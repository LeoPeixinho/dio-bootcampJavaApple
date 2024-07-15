package Functions;

import java.util.Scanner;
public class Home{
	
	private String name;
	private String locality;
	
	

	public Home (){
	Scanner sc = new Scanner (System.in);	

	System.out.println("Seja bem vindo, digite o seu nome: ");
	this.name = sc.nextLine();

	System.out.println("Qual a sua região? ");
	this.locality = sc.nextLine();
	
	}

	public String getName(){
	return name;	
	}	
	public void setName(String name){
	this.name = name;
	}
	
	public String getLocality(){
	return locality;
	}
	public void setLocality(String locality){
	this.locality = locality;
	}
	
	public String toString(){
	System.out.println("Iphone de " + name + " na região: " + locality);	
	return "Iphone de " + name + " na região: " + locality;
	}
}