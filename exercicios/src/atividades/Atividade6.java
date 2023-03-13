package atividades;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		double peso = teclado.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		double imc = peso / altura;
		
		System.out.println("Seu IMC e: " + imc);
		teclado.close();
	}

}
