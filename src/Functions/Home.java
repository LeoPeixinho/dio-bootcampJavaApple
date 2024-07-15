package Functions;

import java.util.Scanner;
public class Home{
	
	private String nome;
	private String localidade;
	
	

	public Home (){
	Scanner sc = new Scanner (System.in);	

	System.out.println("Seja bem vindo, digite o seu nome: ");
	this.nome = sc.nextLine();

	System.out.println("Qual a sua região? ");
	this.localidade = sc.nextLine();
	
	}

	public String getNome(){
	return nome;	
	}	
	public void setNome(String nome){
	this.nome = nome;
	}
	
	public String getLocalidade(){
	return localidade;
	}
	public void setLocalidade(String localidade){
	this.localidade = localidade;
	}
	
	public String toString(){
	System.out.println("Iphone de " + nome + " na região: " + localidade);	
	return "Iphone de " + nome + " na região: " + localidade;
	}
}