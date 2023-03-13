package atividades;

import java.util.Scanner;

public class Desafio5calculadora {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = teclado.nextDouble();
		
		System.out.print("Digite a operacao desejada: ");
		String operacao = teclado.next();
		teclado.nextLine();
		
		double resultado = "+".equals(operacao) ? num1 + num2: 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		
		teclado.close();
		
		
	}

}
