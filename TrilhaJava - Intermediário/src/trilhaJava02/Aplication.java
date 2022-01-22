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
“Habilitado (a) para trabalhar ”, se verdadeiro ou Não habilitado (a)
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

		System.out.print("Deseja verificar H - Homem ou M - Mulher): ");
		op = sc.next();

		Useful imput = new Useful();

		imput.validacaoDeDados(op);

		sc.close();
	}

}
