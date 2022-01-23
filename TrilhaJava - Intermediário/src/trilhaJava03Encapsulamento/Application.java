package trilhaJava03Encapsulamento;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de empregados que deseja cadastar: ");

		Employee[] empregados = new Employee[sc.nextInt()];

		do {

			for (int i = 0; i < empregados.length; i++) {

				System.out.println("Digite o nome do colaborador " + (i + 1) + " : ");
				String nome = sc.next();
				System.out.println("Digite o sobrenome do colaborador " + (i + 1) + " : ");
				String sobrenome = sc.next();
				System.out.println("Digite o CPF do colaborador " + (i + 1) + " : ");
				String cpf = sc.next();
				System.out.println("Digite a idade do colaborador " + (i + 1) + " : ");
				int idade = sc.nextInt();
				System.out.println("Digite o status do colaborador " + (i + 1) + " : ");
				String status = sc.next();
				System.out.println("Digite o logradouro do colaborador " + (i + 1) + " : ");
				String logradouro = sc.next();
				sc.nextLine();
				System.out.println("Digite a cidade do colaborador " + (i + 1) + " : ");
				String cidade = sc.next();
				sc.nextLine();
				System.out.println("Digite o numero da resisdencia do colaborador " + (i + 1) + " : ");
				int numero = sc.nextInt();

				Employee empregado = new Employee(nome, sobrenome, cpf, idade, empregadoAtivo(status),
						new Address(logradouro, cidade, numero));
				empregados[i] = empregado;
				System.out.println("Deseja continuar Cadastrando? (S) ou (N)");
				String opcao = sc.next();

				if (opcao.equalsIgnoreCase("n")) {

					System.out.println();
					System.out.println("SAIDA DOS DADOS DOS EMPREGADOS: ");
					System.out.println();
					break;

				}

			}
			for (Employee empre : empregados) {
				System.out.println(empre);
			}

		} while (false);

		sc.close();
	}

	private static boolean empregadoAtivo(String status) {
		if (status.equalsIgnoreCase("ativo")) {
			return true;
		} else {
			return false;
		}

	}
}
