package atividades;

import java.util.Scanner;

public class EqSegundoGrau {
	public static void main(String[] args) {
		//Declarando a, b e c.
		System.out.println("Equacao de 2 grau é: ax^2 + bx + c = 0");
		System.out.println("Com isto, digite a. ");
		Scanner teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		
		System.out.println("Digite b. ");
		double b = teclado.nextDouble();
		
		System.out.println("Digite c. ");
		double c = teclado.nextDouble();
		
		
		
		//Calculando o Delta
		double delta = (Math.pow(b, 2)) - (4 * a * c);
		
		System.out.println("Delta é: " + delta);
		System.out.println("Com isso é usado a formula: x = b+ ou - Raiz de delta"
				+ " dividido por 2 * a");
		
		//Aplicando na Formula de Bhaskara
	    double raiz = Math.sqrt(delta);
	    
	    double coeficiente = 2 * a;
	   
	    
	    //Calculando resposta
	    double valorxpositivo = (- b + raiz )/ coeficiente;
		double valorxnegativo = (- b - raiz)/coeficiente;
		System.out.println("O valor positivo de X é: " + valorxpositivo);
		System.out.println("O valor negativo de X é: " + valorxnegativo);
		
		teclado.close();
	}

}
