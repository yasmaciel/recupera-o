package br.com.senai;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		String continuar = "s";
		int opcaoDoMenu = 0;
		Scanner tec = new Scanner(System.in);

		do {
			System.out.println("----MENU-----");
			System.out.println("1)cálculo da tabuada");
			System.out.println("2) impressão de sequencia");
			opcaoDoMenu = tec.nextInt();

			switch (opcaoDoMenu) {

			case 1:

				System.out.println("TABUADA");

				System.out.println("informe um numero inteiro: ");
				int valor1 = tec.nextInt();
				int aux = 1;
				System.out.println("Tabuada do numero " + valor1 + ":");
				while (aux < 11) {
					System.out.println(aux + " x " + valor1 + " = " + aux * valor1);
					aux++;
				}
				break;

			case 2:

				Scanner tecScanner = new Scanner(System.in);
				System.out.println("Insira o primeiro valor ");
				int valor3 = tec.nextInt();
				System.out.println("Insira o segundo valor: ");
				int valor2 = tec.nextInt();

				if (valor3 < valor2) {
					while (valor3 <= valor2) {
						System.out.println(valor3);
						valor3++;

					}
				} else if (valor3 > valor2) {
					while (valor3 >= valor2) {
						System.out.println(valor3);
						valor3--;

					}

				}
				break;
			default:
				System.out.println("");
				break;

			}
			System.out.println("Deseja realizar outra operação?");
		} while (continuar == "s");

	}
}
