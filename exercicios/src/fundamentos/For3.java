package fundamentos;

public class For3 {
	
	public static void main(String[] args) {
		
		//variaveis dentro do for
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		//variaveis fora do for
		System.out.println();
		int contador = 0;
		for(contador = 10; contador < 20; contador++) {
			System.out.println(contador);
		}
		
		//for dentro do for
		
		for(int a = 0; a < 10; a++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d", a, j);
			}
		}
	}

}
