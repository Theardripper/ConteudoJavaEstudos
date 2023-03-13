package atividades;

import java.util.Scanner;

import java.util.Locale;

public class Desafio2 {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro salario: ");
		String salario1 = teclado.next().replace(",", ".");
		teclado.nextLine();
		
		System.out.println("Digite seu segundo salario: ");
		String salario2 = teclado.nextLine().replace(",", ".");
		
		System.out.println("Digite seu terceiro salario: ");
		String salario3 = teclado.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double media = (valor1 + valor2 + valor3 / 3);
		System.out.println("A media dos salarios e: " + media);
		
		teclado.close();

		
		
	}

}
