package cursos.metodosJava;

public class Calculadora {
	public static void soma(double numero1, double numero2) {
		System.out.println(numero1+numero2);
	}
	
	public static void subtracao(double numero1, double numero2) {
		System.out.println(numero1-numero2);
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		System.out.println(numero1*numero2);
	}
	
	
	
	public static void divisao(double numero1, double numero2) {
		if (numero2>0)
			System.out.println(numero1/numero2);
		else
			System.out.println("Divisor 0");
	}
}
