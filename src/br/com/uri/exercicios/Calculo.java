package br.com.uri.exercicios;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		Exe1001 ex = new Exe1001();

		ex.setA(sc1.nextInt());
		ex.setB(sc2.nextInt());

		ex.Mostrar();

		sc1.close();
		sc2.close();

	}

}
