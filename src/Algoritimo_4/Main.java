package Algoritimo_4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua primeira nota!");
		BigDecimal nota1 = scanner.nextBigDecimal();

		System.out.println("Digite sua segunda nota!");
		BigDecimal nota2 = scanner.nextBigDecimal();

		System.out.println("Digite sua terceira nota!");
		BigDecimal nota3 = scanner.nextBigDecimal();

		BigDecimal soma = new BigDecimal(0);
		soma = soma.add(nota1).add(nota2).add(nota3);

		BigDecimal media = new BigDecimal(0);
		media = media.add(soma); 
		media = media.divide(new BigDecimal(3)); 
		System.out.println("Sua média é " + media);
	}
}
