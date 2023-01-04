import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();


		System.out.println("Qual sua idade?");
		Integer idade = scanner.nextInt();

		if (idade>=18) {
			System.out.println("O aluno " + nome + " é maior de idade");
		}else {
			System.out.println("O aluno " + nome + " é menor de idade");

		}
	}

} 
