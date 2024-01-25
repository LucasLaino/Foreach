package projetos;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		int NotasTotais = 0;
		double nota = 0;
		double total = 0;
		 
		while(nota != -1) {
			System.out.print("Informe uma nota válida: ");
			nota = input.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				NotasTotais++;
			}else if(nota != -1) {
				System.out.println("Nota Inválida.");
			}
		}
		
		double media = total/NotasTotais;
		System.out.println("Média = " + media);
		
		input.close();
	}
}