package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Cavalo implements Individuo {

	private String nome;
	private Pessoa dono;

	public Cavalo() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public Cavalo(String nome, Pessoa dono) {
		super();
		this.nome = nome;
		this.dono = dono;
	}

	public Cavalo(String string) {
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println("Passa o dia todo comendo pasto " + alimento);

	}

	@Override
	public void locomover(String locomover) {
		System.out.println("Ele corre, trota e " + locomover);

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Ele relincha e " + conteudo);

	}

	public void abastecer(String string) {
		
		
	}

	public void acelerar(int i) {
		// TODO Auto-generated method stub
		
	}

	public void freiar() {
		// TODO Auto-generated method stub
		
	}

}
