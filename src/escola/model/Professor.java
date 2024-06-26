package escola.model;

public class Professor extends Pessoa{

	private String disciplina;
	
	private String formacao;

	public Professor(int id, String nome, int idade, 
			String sexo, String email, String telefone, 
			String disciplina,
			String formacao) {
		super(id, nome, idade, sexo, email, telefone);
		this.disciplina = disciplina;
		this.formacao = formacao;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	//polimorfismo
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Disciplina: "+ this.disciplina);
	}
}