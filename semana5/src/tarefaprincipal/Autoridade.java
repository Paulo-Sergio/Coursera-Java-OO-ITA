package tarefaprincipal;

public class Autoridade {

	private String nome;
	private String sobreNome;
	private FormatadorNome tratamento;
	
	public Autoridade(String nome, String sobreNome, FormatadorNome tratamento) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.tratamento = tratamento;
	}

	public String getTratamento() {
		return tratamento.formatarNome(this.nome, this.sobreNome);
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public FormatadorNome getFormatadorNome() {
		return tratamento;
	}

}
