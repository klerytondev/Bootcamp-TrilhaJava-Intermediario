package trilhaJava02;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String op;
		
		System.out.print("Deseja verificar H - Homem ou M - Mulher): ");
		op = sc.next();
		
		if(op.equalsIgnoreCase("M")) {
			
			Homem homem = new Homem();
			
			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Posuui carteira de trabalho: ");
			boolean carteria = sc.nextBoolean();
			
			homem.setMome(nome);
			homem.setIdade(idade);
			homem.setPossuiCarteiraDeTrabalho(carteria);
		}
			
			
		sc.close();

	}

}
