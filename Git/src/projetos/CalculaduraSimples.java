package projetos;

import java.util.Scanner;

public class CalculaduraSimples {

	public static void main(String[] args) {

			Scanner calculadora = new Scanner(System.in);

			System.out.println("Informe o número: ");
			double num1 = calculadora.nextDouble();

			System.out.println("Informe o número: ");
			double num2 = calculadora.nextDouble();

			System.out.println("Informe a operação: ");
			String operacao = calculadora.next();

			double resultado = "+".equals(operacao) ? num1 + num2 : 0;
			resultado = "-".equals(operacao) ? num1 - num2 : resultado;
			resultado = "*".equals(operacao) ? num1 * num2 : resultado;
			resultado = "/".equals(operacao) ? num1 / num2 : resultado;
			resultado = "%".equals(operacao) ? num1 % num2 : resultado;

			System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
			calculadora.close();
		}
	}