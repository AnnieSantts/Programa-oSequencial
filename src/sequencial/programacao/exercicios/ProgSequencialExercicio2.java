package sequencial.programacao.exercicios;

import java.util.Scanner;

public class ProgSequencialExercicio2 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias. */
		

		int anos, dias, totalanos=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("informe quantos dias você tem");
		dias = leia.nextInt();
		totalanos = dias/365;
		
		System.out.println("sua idade em anos é de: " + totalanos);

	}

}
