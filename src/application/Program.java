package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); //Primeiro exemplo: instancia��o do HashSet 
		                                   // Utiliza��o dos m�todos add(), contains() e clear()
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println("A lista cont�m o item Notebook ? " + set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("---------------------");
		set.clear();
		set.add("TV");
		set.add("Tablet");  //Alterando a ordem de inclus�o para ver se o HashSet mant�m a ordem ou n�o (No caso n�o mant�m a ordem)
		set.add("Notebook");

		for (String p : set) {
			System.out.println(p);
		}
		

	}

}
