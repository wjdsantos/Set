package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;

public class ProgramExerProp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Alunos> set = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int num = sc.nextInt();
		for (int i=0; i < num; i++) {
			int mat = sc.nextInt();
			set.add(new Alunos(mat));
		}

		System.out.print("How many students for course B: ");
		num = sc.nextInt();
		for (int i=0; i < num; i++) {
			int mat = sc.nextInt();
			set.add(new Alunos(mat));
		}
		
		System.out.print("How many students for course C: ");
		num = sc.nextInt();
		for (int i=0; i < num; i++) {
			int mat = sc.nextInt();
			set.add(new Alunos(mat));
		}

		System.out.print("Total students: " + set.size());
		
		sc.close();
	}

}
