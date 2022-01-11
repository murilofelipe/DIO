import lombok.Data;

@Data
public class Documento {
	private TipoDeDocumento tipo;
	private int numero;
	private String orgaoExpedidor;
	public TipoDeDocumento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeDocumento tipo) {
		this.tipo = tipo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	
}
