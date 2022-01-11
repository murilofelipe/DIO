
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Gerente gerente) {
		super(cliente,gerente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}