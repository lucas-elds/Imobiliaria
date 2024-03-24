import java.util.ArrayList;
import java.util.List;

public class Morador {
	private int apto;
	private String nome;
	private Condominio condominio;
	private List<Boleto> boletos;

	public Morador(int apto, String nome, Condominio condominio) {
		this.apto = apto;
		this.nome = nome;
		this.condominio = condominio;
		this.boletos = new ArrayList<Boleto>();
	}
}