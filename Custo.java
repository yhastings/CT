package PacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Custo {
	public static void main(String[] args) {
		
		
		double custoFabrica = 0.0;
		double custoConsumidor = 0.0;
		double imposto = 0.45;
		double distribuidor = 0.28;
		double valorDistribuidor = 0.0;
		double valorImpost = 0.0;
		
		Scanner entradaDouble = new Scanner(System.in);
		DecimalFormat doisDigitos = new DecimalFormat( " 0.00 " );

		System.out.print("Digite o vale de custo do carro R$ ");
		custoFabrica = entradaDouble.nextDouble();

		System.out.println("");

		valorDistribuidor = custoFabrica * distribuidor;
		valorImpost = custoFabrica * imposto;

		custoConsumidor = custoFabrica + valorDistribuidor + valorImpost;

		System.out.println("O valor de custo e R$ "+ doisDigitos.format(custoFabrica));

		System.out.println("");

		System.out.println("Valor do distribuidor R$ "+ doisDigitos.format(valorDistribuidor));
		System.out.println("Imposto R$ "+ doisDigitos.format(valorImpost));
		
		System.out.println("");
		
		System.out.println("O valor ajustado ao consumidor e R$ "+ doisDigitos.format(custoConsumidor));

	}
}
