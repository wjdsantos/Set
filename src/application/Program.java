package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(); //Primeiro exemplo: instanciação do TreeSet - ordenando a lista 
		                                   // Utilização dos métodos add(), contains() e clear()
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println("A lista contém o item Notebook ? " + set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("---------------------");
		set.clear();
		set.add("Tablet");  //Alterando a ordem de inclusão para ver se o TreeSet ordena ou não (No caso ordena)
		set.add("Notebook");
		set.add("TV");

		for (String p : set) {
			System.out.println(p);
		}
	}
}
