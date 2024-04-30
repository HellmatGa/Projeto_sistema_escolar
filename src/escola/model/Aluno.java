package escola.model;

public class Aluno extends Pessoa {

	private String nomeResponsavel;
	
	private int anoMatricula;
	
	private String telResonsavel;

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}

	public String getTelResonsavel() {
		return telResonsavel;
	}

	public void setTelResonsavel(String telResonsavel) {
		this.telResonsavel = telResonsavel;
	}

	public Aluno(int id, String nome, int idade, String sexo, String email, String telefone, String nomeResponsavel,
			int anoMatricula, String telResonsavel) {
		super(id, nome, idade, sexo, email, telefone);
		this.nomeResponsavel = nomeResponsavel;
		this.anoMatricula = anoMatricula;
		this.telResonsavel = telResonsavel;
	}
	
}