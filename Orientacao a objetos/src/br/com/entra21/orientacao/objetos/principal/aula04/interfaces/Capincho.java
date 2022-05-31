package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capincho implements Individuo {

	@Override
	public void alimentar(String alimento) {
		System.out.println("O capincho come mato e " + alimento);

	}

	@Override
	public void locomover(String locomover) {

		System.out.println("O capincho anda, corre e nada");

	}

	@Override
	public void comunicar(String conteudo) {

		System.out.println("...");
	}

}
