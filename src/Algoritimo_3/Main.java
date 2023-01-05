package Algoritimo_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro!");
		Integer numero = scanner.nextInt();
		if(numero % 2 == 0) {//O % tras o resto da divisão.
			System.out.println("É par");
		}else {
			System.out.println("É impar");
		}
	}

}
