package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		System.out.println("Opera��es de conjunto");
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		System.out.println();
		System.out.println("Conjunto a " + a);
		System.out.println("Conjunto b " + b);
		
		// union
		Set<Integer> c = new TreeSet<>(a); //Usando um construtor especial passando uma cole��o como argumento
		c.addAll(b);  //Uni�o com conjunto c com o conjunto b
		System.out.println("a+b " + c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); //Intersec��o do conjunto d, que � c�pia de a, com o conjunto b, ou sej somente os que repetem nos dois conjuntos
		System.out.println("a intersec��o com b " + d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); //Diferen�a entre o conjunto "e" e o conjunto b; ou seja, tiro do conjunto e todos os elementos do conjunto b
		System.out.println("a-b " + e);
	}
}
