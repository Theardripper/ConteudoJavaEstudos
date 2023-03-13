package atividades;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double tempc = teclado.nextDouble();
		double tempf = ((tempc * 1.8) + 32);
		
		System.out.println("A temperatura de Fahrenheit em Celsius é: " + tempf);
		teclado.close();
	}

}
