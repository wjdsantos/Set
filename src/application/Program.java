package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>(); //Terceiro exemplo: instanciação do LinfedHashSet - mantendo a ordem da lista 
		                                   // Utilização dos métodos add(), contains() e clear()
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println("Mantendo a ordem de entrada na lista");
		System.out.println("Testando as operações remove, removeif");
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("--------------------- usando o remove");
		set.remove("Tablet");  //Removendo o item Tablet da lista

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println("--------------------- usando o removeIf");
		System.out.println("Removendo todos os itens que tenham mais de 3 caracteres");
		set.clear();        //Limpando a lista
		set.add("Tablet");  //Recarregando a lista
		set.add("Notebook");
		set.add("TV");
		set.removeIf(x -> x.length() >= 3); //Removendo todos os itens que tenham mais de 3 caracteres

		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("--------------------- usando o removeIf");
		System.out.println("Removendo todos os itens que iniciam com 'T'");
		set.clear();        //Limpando a lista
		set.add("Tablet");  //Recarregando a lista
		set.add("Notebook");
		set.add("TV");
		set.removeIf(x -> x.charAt(0) == 'T'); //Removendo todos os itens que iniciam com 'T'

		for (String p : set) {
			System.out.println(p);
		}
	}
}
