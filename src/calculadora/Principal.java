package calculadora;

import java.util.Scanner;

public class Principal {
	
	static double resultado;

	public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println ("Digite o número 1: ");
				float num1=sc.nextFloat();
				System.out.println ("Digite o número 2: ");
				float num2=sc.nextFloat();
				System.out.print("Escolha uma das opções: \n 1: Somar \n 2: Subtrair \n 3: Multiplicar  \n 4: Dividir: 1\n 0: Sair \n Opção escolhida: ");
				int num3= sc.nextInt();
				Calcula calcula = new Calcula();

				switch (num3)
				{
				 	case 0:
				        System.exit(0);
				        break;
				    case 1:
				        resultado = calcula.somar(num1, num2);
				        break;
				    case 2:
				        resultado = calcula.subtrair(num1, num2);
				        break;
				    case 3:
				        resultado = calcula.multiplicar(num1, num2);
				        break;
				    case 4:
				        resultado = calcula.dividir(num1, num2);
				        break;
				}
			}
			System.out.println("Resultado igual a: "+ resultado);	
	}

}
