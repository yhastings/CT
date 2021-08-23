package PacoteJava;

import java.util.Scanner;

public class Expresao {
	public static void main(String[] args) {
		
		
		double a, b, c;
		double r, s, d, resultadoR, resultadoS;
		
		Scanner estradaInt = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		a = estradaInt.nextDouble();

		System.out.print("Informe o valor de B: ");
		b = estradaInt.nextDouble();

		System.out.print("Informe o valor de C: ");
		c = estradaInt.nextDouble();

		r = a + b;
		s = b + c;

		
		resultadoR = Math.pow(r,2);
		
		System.out.println(a+b +" ao quadrado é igual a: "+ resultadoR);
		
		resultadoS = Math.pow(s,2);

		System.out.println(b+c +" ao quadrado é igual a: "+ resultadoS);

		d = (resultadoR + resultadoS) / 2;

		System.out.println("O resultado da expressao e "+ Math.round(d));

	}
}
