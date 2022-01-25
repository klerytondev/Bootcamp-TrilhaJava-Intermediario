package trilhaJava04Enum;

import java.util.Scanner;

public class Userful {

	Scanner sc = new Scanner(System.in);

	public void cadastroPascientes(String op) {

		if (op.equalsIgnoreCase("s")) {

			System.out.print("Digite a quantidade de pascientes que deseja cadastar: ");
			Pascientes[] pascientes = new Pascientes[sc.nextInt()];
			do {

				for (int i = 0; i < pascientes.length; i++) {

					System.out.print("Digite o nome: ");
					String nome = sc.next();
					System.out.print("Digite o sobrenome: ");
					String sobrenome = sc.next();
					System.out.print("Digite a idade: ");
					int idade = sc.nextInt();
					System.out.print("Digite o peso: ");
					double peso = sc.nextDouble();
					System.out.print("Digite a altura: ");
					double altura = sc.nextDouble();

					Pascientes pasciente = new Pascientes(nome, sobrenome, idade, peso, altura);
					pascientes[i] = pasciente;
					
					System.out.println("Deseja continuar Cadastrando? (S) ou (N)");
					String opcao = sc.next();

					if (opcao.equalsIgnoreCase("n")) {

						System.out.println();
						System.out.println("SAIDA DOS DADOS DOS PASCIENTES ");
						System.out.println();
						break;

					}

				}
				for (Pascientes dados : pascientes) {
					System.out.println(dados);
				}

			} while (false);
		}else

	{
		System.out.println("Fim do programa!");
	}

}

}