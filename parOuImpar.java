

import java.util.Scanner;


public class parOuImpar {
	

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int i = scan.nextInt();
		
		int resto = i % 2;
		
		if (resto==0) {
			System.out.println("Número par!");
		}else {
			System.out.println("Número impar!");
		}
		
	}

}
