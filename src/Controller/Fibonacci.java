package Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	

	public void calcular() {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number = scan.nextInt();
        int n1 = 0, n2 = 1;
        for (int qtd = number+2; qtd > 0; qtd--) {
            result.add(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(result);
        
        if(result.contains(number)) {
        	System.out.println("A sequência contém o número: " + number+"\n------------------");
        }else {
        	System.out.println("A sequência NÃO contém o número: " + number+"\n------------------");
        }
        
	}

}
