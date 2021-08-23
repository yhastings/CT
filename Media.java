package PacoteJava;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		
		Scanner estradaInt = new Scanner(System.in);

		System.out.print("Nota 1: ");
		n1 = estradaInt.nextInt();

		System.out.print("Nota 2: ");
		n2 = estradaInt.nextInt();

		System.out.print("Nota 3: ");
		n3 = estradaInt.nextInt();

		media = (2 * n1 + 3 * n2 + 5 * n3) / (2 + 3 + 5);

		System.out.println("A media desse aluno e "+ media);
		
	}
}
