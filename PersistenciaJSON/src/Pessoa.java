import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pessoa {
	//atribucts
	private String nome;
	private int idade;
	//constructor default e c/ parametros
	public Pessoa() {
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
