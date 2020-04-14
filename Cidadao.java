package dados;

public class Cidadao {
	// Atributos
	private String nome;
	private String cpf; // gerado automaticamente
	private double salario;
	private int idade;
	private String sexo;
	private int numFilhos;

	// -------------------------Métodos-------------------------

	// Construtor
	public Cidadao(String nome, String cpf, double salario, int idade, String sexo, int numFilhos) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
		setIdade(idade);
		setSexo(sexo);
		setNumFilhos(numFilhos);
	}

	// ------Getters and Setters

	// ---------------------------------------Nome
	public String getNome() {
		return this.nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	// ---------------------------------------CPF
	public String getCpf() {
		return this.cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// ---------------------------------------Salário
	public double getSalario() {
		return this.salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}

	// ---------------------------------------Idade
	public int getIdade() {
		return this.idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	// ---------------------------------------Sexo
	public String getSexo() {
		return this.sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// ---------------------------------------Número de filhos
	public int getNumFilhos() {
		return this.numFilhos;
	}

	private void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}

}
