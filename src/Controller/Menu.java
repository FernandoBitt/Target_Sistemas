/*Fernando Bittencourt dos Santos
 * 15/07/2022
 * Application test
 */



package Controller;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		
		int opc = 0;
		
		Fibonacci fibo = new Fibonacci();
		Faturamento fatu = new Faturamento();
		Percentual perc = new Percentual();
		Inverter inve = new Inverter();
		
		
		while(opc!=9){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\nDigite a opção desejada:\n2 - Fibonacci\n3 - Faturamento      "
					+ "\n4 - Percentual por estado \n5 - Inverter Caracter \n9 - Finalizar");
			opc = scan.nextInt();
			
			switch (opc){
            case 2:
                fibo.calcular();
                break;
            case 3:
            	fatu.lerJson();
                break;
            case 4:
                perc.calcularPercentual();
                break;
            case 5:
                inve.inverterCaracter();
                break;
            case 9:
                System.out.println("Saindo");
                scan.close();
                break;    
            case 0:
                System.out.println("Digite uma opção");
                break;
            default:
                System.out.println("\nOpção Inválida");
			}
			
		}
	}

}
