package trilhaJava02;

import java.util.Scanner;

/*
 * 
 * > Criar uma classe abstrata Pessoa que tenha 2 métodos abstratos
boleanos , andar e falar com parametro de entrada idade do tipo
inteiro em cada método.
Criar uma classe abstrata SerHumano tem um atributo idade , que
implementa os metodos abstratos de Pessoa.
Regras:
métodoandar com idade maior que 1
métodofalar com idade maior que 3

>SerHumano tem um método abstrato habilitadoTrabalhar que tem
um retorno boleano com parâmetros : boleano
possuiCarteiraDeTrabalho e inteiro idade
Regra:
Se aidade for maior ou igual a 18 anos o retorno será verdadeiro,
senão caso contrário.

> Crie uma classe Homem e outra Mulher com atributos
(String, nome, int idade, Boolean possuiCarteiraDeTrabalho) para
implementar o método habilitadoTrabalhar
Faça validação com os métodos implementados andar e falar nas
classes Homem e Mulher( lógica : todos devem ser verdadeiros para
passar)

> Use Scanner e entrada de dados na classe Main para instanciar
Classes Homem e Mulher para poder fazer a saida das informações e
garantir que a logica está funcionando.

> PLUS Detalhe , no final deve escrever no console: Uma mensagem
“
Habilitado (a) para trabalhar ”, se verdadeiro ou Não habilitado (a)
para trabalhar idade invalida ou carteira nao habilitada ” para falso
use encapsulamento e polimorfismo para isso.
 *
 * 
 * @Kleryton de Souza
 * 
 * */

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String op;
		boolean carteira;

		System.out.print("Deseja verificar H - Homem ou M - Mulher): ");
		op = sc.next();

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
