package trilhaJava02;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String op;
		boolean carteira;

		System.out.print("Deseja verificar H - Homem ou M - Mulher): ");
		op = sc.next();

		if (op.equalsIgnoreCase("m")) {

			Men homem = new Men();

			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Posuui carteira de trabalho S(sim) - N(n�o): ");
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
				System.out.println(homem.getNome() + " Est� habilidado para trabalhar");
			} else {
				System.out.println(homem.getNome() + " N�o est� habilitado "
						+ "para trabalhar - idade invalida ou carteira n�o habilitada");
			}

		} else {

			Woman mulher = new Woman();

			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Posui carteira de trabalho S(sim) - N(n�o): ");
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
				System.out.println(mulher.getNome() + " Est� habilidado para trabalhar.");
			} else {
				System.out.println(mulher.getNome() + " N�o est� habilitado "
						+ "para trabalhar - idade invalida ou carteira n�o habilitada.");
			}
		}

		sc.close();

	}

}
