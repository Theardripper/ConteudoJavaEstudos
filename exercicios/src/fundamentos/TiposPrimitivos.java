package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Tipos númericos inteiros
		byte anosDeempresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_8845_223L;
		
		
		//Tipos númericos flutuantes
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeferias = false;
		
		//Tipo de caractere
		char status = 'A';
		
		System.out.println(anosDeempresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println("Ferias? "+ estaDeferias);
		
		
		
	}

}
