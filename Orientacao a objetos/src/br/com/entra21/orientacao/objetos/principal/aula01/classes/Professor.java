package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {

	// Atributos static são de dominio da CLASSE e não de cada objeto
	// Então nenhum objeto dessa classe tem esse tipo de atributo
	// Para fazer acessos static basta informar a Classe.oqueVCquer, sem utilizar
	// new
	public static String instituicao = "Proway";

	// atributos devem ser private e se possível
	// criar get e sets pra quem realmente precisa
	private String nome;
	private byte idade;
	private byte quantidadeAlunos;

	public Professor() {
		// Construtor vazio não inicializa os atributos

	}

	// new é criar objetos
	public Professor(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
		// Construtor com parametros
		// Pode inicializar alguns ou todos os atributos
	}

	public String getNome() {
		// ler o valor la fora
		return this.nome;
	}

	public void setNome(String nome) {
		// receber um valor novo la de fora
		this.nome = nome;
	}

	public String getIdade() {
		// TODO Auto-generated method stub
		return null;
	}

}
