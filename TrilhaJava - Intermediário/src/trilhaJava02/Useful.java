package trilhaJava02;

import java.util.Scanner;

public class Useful {

	public void validacaoDeDados(String op) {

		Scanner sc = new Scanner(System.in);
		boolean carteira;

		if (op.equalsIgnoreCase("m")) {

			Mens homem = new Mens();

			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Posuui carteira de trabalho S(sim) - N(não): ");
			String resp = sc.next();
			if (resp.equalsIgnoreCase("s")) {
				carteira = true;
			} else {
				carteira = false;
			}

			homem.setNome(nome);
			homem.setIdade(idade);
			homem.setPossuiCarteiraDeTrabalho(carteira);

			if (homem.habilitadoTrabalhar(carteira, idade) == true) {
				System.out.println(homem.getNome() + " Está habilidado para trabalhar");
			} else {
				System.out.println(homem.getNome() + " Não está habilitado "
						+ "para trabalhar - idade invalida ou carteira não habilitada");
			}

		} else {

			Woman mulher = new Woman();

			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Posui carteira de trabalho S(sim) - N(não): ");
			String resp = sc.next();
			if (resp.equalsIgnoreCase("s")) {
				carteira = true;
			} else {
				carteira = false;
			}

			mulher.setNome(nome);
			mulher.setIdade(idade);
			mulher.setPossuiCarteiraDeTrabalho(carteira);

			if (mulher.habilitadoTrabalhar(carteira, idade) == true) {
				System.out.println(mulher.getNome() + " Está habilidado para trabalhar.");
			} else {
				System.out.println(mulher.getNome() + " Não está habilitado "
						+ "para trabalhar - idade invalida ou carteira não habilitada.");
			}
		}

		sc.close();

	}

}
