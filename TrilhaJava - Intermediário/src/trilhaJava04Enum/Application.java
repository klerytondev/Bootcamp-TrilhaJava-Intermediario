package trilhaJava04Enum;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Userful util = new Userful();

		System.out.println("=====================CASTRAR PASCIENTES====================== ");
		System.out.print("Deseja cadastrar pascientes? S- SIM | N - NÃO: ");
		util.cadastroPascientes(sc.next());

		sc.close();
	}

}
