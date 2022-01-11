
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Gerente gerente) {
		super(cliente, gerente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}