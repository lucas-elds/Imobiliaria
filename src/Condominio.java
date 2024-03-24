import java.util.ArrayList;
import java.util.List;

public class Condominio {
	private int id;
	private String nome;
	private String endereco;
	private List<Morador> moradores;

	public Condominio(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.moradores = new ArrayList<Morador>();
	}
}
