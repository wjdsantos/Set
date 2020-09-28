package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		//Como as coleções Hash testam igualdade?
		//Se hashCode e equals estiverem implementados, primeiro testa hashCode e se verdadeiro confirma com o equals
		//Se não o teste será por ponteiros dos objetos
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		//Dois testes foram feitos aqui; primeiro sem a implementação hashCode e equals
		//e depois com estas implementações.
		//Na primeira foi feita por ponteiros, já que não tinha hashCode e equals, então as duas instaciações geraram
		//ponteiros diferentes e portanto a igualdade é falsa.
		//Na segunda, com a implementação do hashCode e equals, a comparação foi feita por comparação de conteúdo e como os
		//conteúdos são iguais o resultado foi verdadeiro.
		//Essa implementações foram feitas na classe Product.
		System.out.println(set.contains(prod));
	}
}
