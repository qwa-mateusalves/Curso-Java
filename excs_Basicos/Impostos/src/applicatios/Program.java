package applicatios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Insira o número de pessoas para calcular a taxa: ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println("#" +i);
			System.out.print("Individual ou compania (i/c)? ");
			char response = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda: ");
			double renda = sc.nextDouble();
			
			if (response == 'i') {
				System.out.print("Gasto em saúde: ");
				double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, renda, gastoSaude));
			}
			else {
				System.out.print(": Número de funcionários: ");
				int nFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, nFuncionarios));
			}	
		}
		double totalTaxes = 0;
		System.out.println();
		System.out.println("TAXAS A SEREM PAGAS:");
		for (Pessoa pessoa: list) {
			System.out.println(pessoa.getNome() + ": $" + pessoa.imposto());
			totalTaxes += pessoa.imposto();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $" + totalTaxes);
		
		sc.close();
	}
}
