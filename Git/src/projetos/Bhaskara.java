package projetos;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {

		Scanner equacao = new Scanner(System.in);

		System.out.println("Equação: ax² + bx + c = 0");

		System.out.println("Iforme o valor de A: ");
		double a = equacao.nextDouble();

		System.out.println("Iforme o valor de B: ");
		double b = equacao.nextDouble();

		System.out.println("Iforme o valor de C: ");
		double c = equacao.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("O delta é:" + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);// Math.sqrt equivale a raiz
		System.out.printf("O x1 da euquação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x2 da equação é: %.2f", x2);

		equacao.close();
	}

}

