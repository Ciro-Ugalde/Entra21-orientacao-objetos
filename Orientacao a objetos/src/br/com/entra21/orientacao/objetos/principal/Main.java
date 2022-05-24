package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;

public class Main {

	// O objeto da CLASSE scanner esta na variavel de entrada, então é um ojeto
	// Porém, o System.in é uma chamada static pq
	// Para acessar o in do System não precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender classes");
			System.out.println("2 - Aprender herança");

			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprenderHeranca();
				break;
			default:
				System.out.println("Escolha uma opção válida");
				break;
			}
		} while (opcao != 0);


	}

	public static void aprenderHeranca() {

	}

	public static void aprenderClassesObjetos() {
		
		Diretor diretor1= new Diretor();
		diretor1.realizarApresentacao();
		Diretor diretor2= new Diretor();
		diretor2.realizarApresentacao();
		Diretor diretor3= new Diretor("Paulo", (byte) 80);
		diretor3.realizarApresentacao();
		Professor professorJava = new Professor();

		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("Nome dela = " + professoraIngles.getNome());

		professoraIngles.setNome("Isabelle 2");

		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		Aluno alunoObjeto;

		alunoObjeto = new Aluno();

		alunoObjeto.idade = 18;

		alunoTeste.nome = "Ciro";
		alunoTeste.idade = 33;

		outroAluno.idade = 11;
		outroAluno.nome = "Cleytinho";

		alunoTeste.responderChamada();

		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = input.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = input.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);
	}

}