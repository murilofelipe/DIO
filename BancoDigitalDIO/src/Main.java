
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Gerente roberto = new Gerente();
		roberto.setNome("Roberto");
		
		Conta cc = new ContaCorrente(venilton, roberto);
		Conta poupanca = new ContaPoupanca(venilton, roberto);
		

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		Usuario u = new Usuario();
		u.setSenhaAcesso("2");
	}

}