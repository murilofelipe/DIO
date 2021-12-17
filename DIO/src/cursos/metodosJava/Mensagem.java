package cursos.metodosJava;

public class Mensagem {
	public static void obterMensagem(int hora) {
		if (hora>=6 && hora<12) {
			BomDia();
		}else if(hora>=12 && hora<=18) {
			BoaTarde();
		}else
			BoaNoite();
	}
	
	public static void BomDia() {
		System.out.println("Bom dia!");
	}
	
	public static void BoaTarde() {
		System.out.println("Boa tarde!");
	}
	
	public static void BoaNoite() {
		System.out.println("Boa noite!");
	}
}
