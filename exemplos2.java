package estudos;

import java.util.Scanner;

public class exemplos2 {
	public static void main(String[] args) {
		// pra uma melhor pratica de codigo e espaço é melhor colocar esse.
		// os numeros em tipo byte pode ser armazenado em int mesmo dando mais de duas
		// casas digitais no resultado final.
		// byte não pode armazenar numeros de mais de duas casas decimais.
		// e tambem pode ser armazenado por double! Simplesmente genial o byte
		operações();

	}

	public static void operações() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		byte n1 = sc.nextByte();
		System.out.println("Digite um numero");
		byte n2 = sc.nextByte();
		System.out.println("Qual operação matematica voce quer?");
		System.out.println("1-Adição");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		int escolha = sc.nextInt();
		switch (escolha) {
		case 1:
			int soma = n1 + n2;
			System.out.println("O resultado da soma é: " + soma);
			todoagain();
			break;
		case 2:
			int Subtracao = n1 - n2;
			System.out.println("O resultado da Subtração é: " + Subtracao);
			todoagain();
			break;
		case 3:
			int Multiplicação = n1 * n2;
			System.out.println("O resultado da multiplicação é " + Multiplicação);
			todoagain();
			break;
		case 4:
			double Divisao = n1 / n2;
			System.out.println("O resultado da Divisão é " + Divisao);
			todoagain();
			break;
		}
	}
	public static void todoagain() {
		Scanner sc = new Scanner(System.in);
	 System.out.println("Quer fazer outra operação?");
	 System.out.println("Digite 1 para continuar e 2 para sair");
	 byte escolha1 = sc.nextByte();
	 if(escolha1 == 1) {
		 operações();
	 }else if(escolha1 == 2) {
		 System.out.println("Obrigado! Até a proxima!!"); 
	 }
	}
}