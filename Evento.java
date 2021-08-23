package PacoteJava;

import java.util.Scanner;

public class Evento {
public static void main(String[] args) {
		
		int duracao;
		int horas;
		int minutos;
		int segundos;
		
		Scanner lerInteiro = new Scanner(System.in);

		System.out.print("Escreva o tempo de duracao do evento em segundos: ");
		duracao = lerInteiro.nextInt();

		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;

		System.out.println("Horas: "+ horas);
		System.out.println("Minutos: "+ minutos);
		System.out.println("Segundos: "+ segundos);

	}
}
