package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		final double operacao = 5.0/9.0;
		final double fator = 32; 
		
		double fahrenhait = 86;
		double celsius = (fahrenhait - fator) * operacao;
		
		
				System.out.println(celsius);
	}

}
