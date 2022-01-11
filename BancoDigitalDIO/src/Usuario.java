import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Usuario {
	private String login;
	private String senhaAcesso;
	private String senhaTransacao;
	public String getLogin() {
		return login;
	}
	
	
	
	//Deve conter 8 caracteres
	public void setSenhaTransacao(String senhaTransacao) {
		if (senhaTransacao.length()==8)
			this.senhaTransacao = senhaTransacao;
		else
			System.out.println("A senha para transações deve conter 8 caracteres.");
	}
	public Usuario(String login, String senhaAcesso, String senhaTransacao) {
		super();
		this.login = login;
		this.senhaAcesso = senhaAcesso;
		this.senhaTransacao = senhaTransacao;
	}
	public Usuario(String login, String senhaAcesso) {
		super();
		this.login = login;
		this.senhaAcesso = senhaAcesso;
	}



	public void setSenhaAcesso(String senhaAcesso) {
		if (senhaAcesso.length() == 6)
			this.senhaAcesso = senhaAcesso;
		else {
			System.out.println("Senha de acesso deve conter 6 caracteres");
		}
			
	}
	
	

	
}
