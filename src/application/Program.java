package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		System.out.println("Operações de conjunto");
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		System.out.println();
		System.out.println("Conjunto a " + a);
		System.out.println("Conjunto b " + b);
		
		// union
		Set<Integer> c = new TreeSet<>(a); //Usando um construtor especial passando uma coleção como argumento
		c.addAll(b);  //União com conjunto c com o conjunto b
		System.out.println("a+b " + c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); //Intersecção do conjunto d, que é cópia de a, com o conjunto b, ou sej somente os que repetem nos dois conjuntos
		System.out.println("a intersecção com b " + d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); //Diferença entre o conjunto "e" e o conjunto b; ou seja, tiro do conjunto e todos os elementos do conjunto b
		System.out.println("a-b " + e);
	}
}
