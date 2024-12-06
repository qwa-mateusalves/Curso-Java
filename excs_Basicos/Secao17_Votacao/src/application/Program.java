package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String,Integer> votacao = new TreeMap<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String candidato= fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if (votacao.containsKey(candidato)) {
					int countVotos = votacao.get(candidato);
					votacao.put(candidato, votos + countVotos);
				}
				else {
					votacao.put(candidato, votos);
				}
				
				
				line = br.readLine();
		}	
			for (String key: votacao.keySet()) {
				System.out.println(key + ": " + votacao.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
