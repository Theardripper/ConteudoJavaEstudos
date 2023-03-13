package exercicioclasse;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 23;
		d1.mes = 12;
		d1.ano = 1999;
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.println(d1.obterDataFormatada());
		
	}
}
