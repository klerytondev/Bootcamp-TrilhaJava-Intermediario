package metaCorrida;

import java.util.Scanner;

/*
 * 
 * Uma academia precisa de um sistema que controle o percurso de
 * determinado cliente em um determinado periodo realizado na esteira,
 * conforme meta estipulada.
 * Criar um sistema para controlar os kilometros percorridos de uma
 * pessoa em um determinado periodo com metas estipuladas.
 * Obrigatório Usar classe(s), método(s) e operadore(s) de repetição. Usar
 * Scanner para entrada de dados pelo teclado necessario para atender a
 * necessidade do programa da academia.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 1;
		String op;

		System.out.println("======================================================");
		System.out.println("=============PROGRAMA DE META CORRIDA=================");
		System.out.println("======================================================");

		System.out.print("Deseja cadastrar um corredor? S(sim) - N(não): ");
		op = sc.next();

		if (op.equalsIgnoreCase("s")) {
			Corredor corredor = new Corredor();

			System.out.print("Entre com o objetivo a ser corrido: ");
			int obj = sc.nextInt();
			System.out.print("Entre com o nome do corredor: ");
			String nome = sc.next();

			do {

				System.out.print("Entre com os quilometros corridos no dia " + i + ": ");
				int km = sc.nextInt();
				i++;
				corredor.setOjetivo(obj);
				corredor.setMome(nome);
				corredor.setKmCorridos(km);
				if (corredor.retorno() == false) {
					System.out.println("Total acumulado: " + corredor.getKmCorridos() + "Km - continue a correr!");
				}

				else {
					System.out.println(corredor);
					break;
				}
				System.out.print("Deseja continuar correndo? S(sim) - N(não): ");
				op = sc.next();
				if (op.equalsIgnoreCase("n")) {
					System.out.println("Infelimente você não atingiu sua meta!");
				}

			} while (op.equalsIgnoreCase("s"));

		} else {
			System.out.println("Finalizado o programa!");
			System.out.println("======================================================");
		}
		System.out.println("Finalizado o programa!");
		System.out.println("==========================================================");
		sc.close();
	}
}
