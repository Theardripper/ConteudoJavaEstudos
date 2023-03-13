package atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		double reajuste = 0.0;
		double fator = 1.01;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu saldo:");
		double saldo = teclado.nextDouble();

		reajuste = saldo * fator;

		System.out.println(reajuste);

	}

}
