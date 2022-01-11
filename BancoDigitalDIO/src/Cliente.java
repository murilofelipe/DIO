import java.util.List;

import lombok.Data;

@Data
public class Cliente extends Pessoa {
	private List<Conta> conta;
	private Usuario usuario;
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void aberturaDeConta() {
		
	}
	
	public void fechamentoDeConta() {
		
	}
	
	private void cadastro() {
		
	}
	
	
	
	
	
	
	

}