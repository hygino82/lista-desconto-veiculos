package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Veiculo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// usa ponto como separador decimal
		Scanner sc = new Scanner(System.in);
		List<Veiculo> lista = new ArrayList<>();
		System.out.println("Lista de veículos");
		char opcao;

		do {

			System.out.print("Informe o nome do veículo: ");
			String nome = sc.nextLine();
			System.out.print("Informe o preço do veículo: ");
			double preco = sc.nextDouble();
			System.out.print("Informe o ano do veículo: ");
			int ano = sc.nextInt();
			Veiculo veiculo = new Veiculo(nome, preco, ano);

			lista.add(veiculo);

			System.out.print("\nAdicionar outro veículo? [S/N]: ");
			opcao = sc.next().charAt(0);
			sc.nextLine();
		} while (opcao != 'N' && opcao != 'n');

//		Veiculo v1 = new Veiculo("Fusca", 3254.46, 1981);
//		Veiculo v2 = new Veiculo("Kombi", 7200.56, 2006);
//		lista.add(v1);
//		lista.add(v2);

		System.out.println("\nFim da entrada de dados\n");

		for (Veiculo v : lista) {
			System.out.println(v);
		}

		sc.close();

	}
}
