package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		//Como as cole��es Hash testam igualdade?
		//Se hashCode e equals estiverem implementados, primeiro testa hashCode e se verdadeiro confirma com o equals
		//Se n�o o teste ser� por ponteiros dos objetos
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		//Dois testes foram feitos aqui; primeiro sem a implementa��o hashCode e equals
		//e depois com estas implementa��es.
		//Na primeira foi feita por ponteiros, j� que n�o tinha hashCode e equals, ent�o as duas instacia��es geraram
		//ponteiros diferentes e portanto a igualdade � falsa.
		//Na segunda, com a implementa��o do hashCode e equals, a compara��o foi feita por compara��o de conte�do e como os
		//conte�dos s�o iguais o resultado foi verdadeiro.
		//Essa implementa��es foram feitas na classe Product.
		System.out.println(set.contains(prod));
	}
}
