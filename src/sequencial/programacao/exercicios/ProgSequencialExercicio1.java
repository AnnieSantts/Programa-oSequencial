package sequencial.programacao.exercicios;

import java.util.Scanner;

public class ProgSequencialExercicio1 {

	public static void main(String[] args) {
		
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias. */
		
		
		int anos, meses, dias, totalDias=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("informe quantos anos você tem");
		anos = leia.nextInt();
		totalDias = totalDias + (anos *365);
		
		
		System.out.println("informe quantos meses você tem");
		meses = leia.nextInt();
		totalDias = totalDias +  (meses * 30);
		

		System.out.println("informe quantos dias você tem");
		dias = leia.nextInt();
		totalDias = totalDias + dias;
		
		System.out.println("sua idade em dias é de: " + totalDias);
		
	}

}
