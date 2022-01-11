import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Pessoa {
	private String nome;
	private List<Documento> documento;
	private String endereco;
	
	
}
