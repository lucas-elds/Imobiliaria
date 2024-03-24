import java.time.LocalDate;
// teste
public class Boleto {
	private Condominio condominio;
	private Morador morador;
	private LocalDate data;
	private double valor;
	private boolean pagou;

	public Boleto(Condominio condominio, Morador morador, String data, double valor) {
		this.condominio = condominio;
		this.morador = morador;
		this.data = LocalDate.parse(data);
		this.valor = valor;
		this.pagou = false;
	}
}
