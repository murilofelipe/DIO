package cursos.metodosJava;

public class calculaArea {
	
	public static double area(double lado) {
		System.out.println("Quadrado de lado: " + lado);
		return lado*lado;
	}
	public static double area(double base, double altura) {
		System.out.println("Retângulo de base: " + base + " altura: " + altura);
		return base*altura;
	}
	public static double area(double base, double altura, double baseMaior) {
		System.out.println("Retângulo de base: " + base + " altura: " + altura + " baseMaior: " + baseMaior);
		return (baseMaior+base)*altura/2;
	}
}
