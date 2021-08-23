package PacoteJava;

import java.util.Scanner;

public class Equa {
	public static void main(String[] args) {

		
		double a, b, c, d, e1, f, x, y;
		
		Scanner entradaDouble = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		a = entradaDouble.nextDouble();

		System.out.print("Digite o valor de B: ");
		b = entradaDouble.nextDouble();

		System.out.print("Digite o valor de C: ");
		c = entradaDouble.nextDouble();

		System.out.print("Digite o valor de D: ");
		d = entradaDouble.nextDouble();

		System.out.print("Digite o valor de E: ");
		e1 = entradaDouble.nextDouble();

		System.out.print("Digite o valor de F: ");
		f = entradaDouble.nextDouble();

		x = ((c * e1) - (b * f)) / ((a * e1) - (b * d));
	 	y = ((a * f) - (c - d)) / ((a * e1) - (b * d));

	 	System.out.println("O valor de  X: "+ Math.ceil(x));
	 	System.out.println("O valor de  X: "+ Math.ceil(y));

	}

}
