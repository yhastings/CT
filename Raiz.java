package PacoteJava;

import java.util.Scanner;

public class Raiz {
	public static void main(String[] args) {

		double d, x1, x2, y1, y2, p1, p2;
		
		Scanner entradaDouble = new Scanner(System.in);

		System.out.print("Digite o valor de X1: ");
		x1 = entradaDouble.nextDouble();

		System.out.print("Digite o valor de X2: ");
		x2 = entradaDouble.nextDouble();

		System.out.print("Digite o valor de Y1: ");
		y1 = entradaDouble.nextDouble();

		System.out.print("Digite o valor de Y2: ");
		y2 = entradaDouble.nextDouble();
		
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		System.out.println("O resultado e "+ Math.ceil(d));

	}
}
