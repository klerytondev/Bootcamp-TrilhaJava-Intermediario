package trilhaJava02;

import java.util.Scanner;

/*
 * 
 * > Criar uma classe abstrata Pessoa que tenha 2 m�todos abstratos
boleanos , andar e falar com parametro de entrada idade do tipo
inteiro em cada m�todo.
Criar uma classe abstrata SerHumano tem um atributo idade , que
implementa os metodos abstratos de Pessoa.
Regras:
m�todoandar com idade maior que 1
m�todofalar com idade maior que 3

>SerHumano tem um m�todo abstrato habilitadoTrabalhar que tem
um retorno boleano com par�metros : boleano
possuiCarteiraDeTrabalho e inteiro idade
Regra:
Se aidade for maior ou igual a 18 anos o retorno ser� verdadeiro,
sen�o caso contr�rio.

> Crie uma classe Homem e outra Mulher com atributos
(String, nome, int idade, Boolean possuiCarteiraDeTrabalho) para
implementar o m�todo habilitadoTrabalhar
Fa�a valida��o com os m�todos implementados andar e falar nas
classes Homem e Mulher( l�gica : todos devem ser verdadeiros para
passar)

> Use Scanner e entrada de dados na classe Main para instanciar
Classes Homem e Mulher para poder fazer a saida das informa��es e
garantir que a logica est� funcionando.

> PLUS Detalhe , no final deve escrever no console: Uma mensagem
�Habilitado (a) para trabalhar �, se verdadeiro ou N�o habilitado (a)
para trabalhar idade invalida ou carteira nao habilitada � para falso
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
