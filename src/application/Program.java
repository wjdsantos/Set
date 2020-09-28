package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();
		
		//Exemplo de implementacao de ordenação pelo TreeSet
		//Lembrando que compareTo deve ser implementado para que o TreeSet funcione.
		//Nesse caso a implementacao do comprareTo deve ser feita na classe Product.
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}
	}
}
