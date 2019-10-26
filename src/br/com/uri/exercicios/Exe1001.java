package br.com.uri.exercicios;

import br.com.uri.exercicios.Soma;

public class Exe1001 extends Soma implements Calc {

	public int Calculo(int a, int b) {

		super.setA(a);
		super.setB(b);
		return super.getA() + super.getB();
	}

	public void Mostrar() {
		System.out.println("X = " + Calculo(super.getA(), super.getB()));
	}
}
