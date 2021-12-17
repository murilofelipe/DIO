package cursos.metodosJava;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora.soma(1, 3);
		Calculadora.subtracao(1, 4);
		Calculadora.multiplicacao(1, 0);
		Calculadora.divisao(1, 0);
		Calculadora.divisao(1, 2);
		
		Mensagem.obterMensagem(0);
		Mensagem.obterMensagem(6);
		Mensagem.obterMensagem(12);
		Mensagem.obterMensagem(22);
		Calendar c = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		Mensagem.obterMensagem(hora);
		
		System.out.println(Emprestimo.jurosSimples(5000, 0.5,1));
		System.out.println(Emprestimo.jurosComposto(5000, 0.5,1));
		
		System.out.println(Emprestimo.jurosSimples(5000, 0.5,2));
		System.out.println(Emprestimo.jurosComposto(5000, 0.5,2));
		
		
		System.out.println("Area: " + calculaArea.area(2));
		System.out.println("Area: " + calculaArea.area(2,4));
		System.out.println("Area: " + calculaArea.area(2,2,4));
		
	}
	

}
