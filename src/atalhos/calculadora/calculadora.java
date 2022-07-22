package atalhos.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma1 = soma1(a,b);
		int subtracao  = subtracao(a,b);
		double divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma: " +  soma1);
		System.out.println("subtração: " + subtracao);
		System.out.println("divisão: " + divisao);
		System.out.println("multiplicação: " + multiplicacao);
		
	}
	public static int soma1(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static double divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	
}
