package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Dog implements Individuo {

	private String nome;
	private Pessoa dono;

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

	public Dog(String nome, Pessoa dono) {
		super();
		this.nome = nome;
		this.dono = dono;
	}

	public Dog(String string) {

	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println("Quero comer carne, to cansado de comer " + alimento);

	}

	@Override
	public void locomover(String locomover) {
		System.out.println("Gosto de correr, mas se for pra brincar com a bolinha é melhor ainda");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(
				"Sempre que quero brincar, fico espirrando na cara dos meus pais, eles já sabem o que eu quero =)");

	}

	public void locomover() {
		// TODO Auto-generated method stub
		
	}

}
