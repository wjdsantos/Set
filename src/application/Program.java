package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); //Primeiro exemplo: instanciação do HashSet 
		                                   // Utilização dos métodos add(), contains() e clear()
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println("A lista contém o item Notebook ? " + set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("---------------------");
		set.clear();
		set.add("TV");
		set.add("Tablet");  //Alterando a ordem de inclusão para ver se o HashSet mantém a ordem ou não (No caso não mantém a ordem)
		set.add("Notebook");

		for (String p : set) {
			System.out.println(p);
		}
		

	}

}
