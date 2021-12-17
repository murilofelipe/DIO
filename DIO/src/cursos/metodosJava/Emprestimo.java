package cursos.metodosJava;

public class Emprestimo {
	
	public static double jurosSimples(double valor, double taxa, int parcelas) {
		return valor + (valor*taxa*parcelas);
	}
	
	public static double jurosComposto(double valor, double taxa, int parcelas) {
		return valor*(1+taxa)*parcelas;	
	}
	
}
