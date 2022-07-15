package Controller;

import java.util.Scanner;

public class Inverter {

	public void inverterCaracter() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String texto = scan.next();
		String invertido = "";
		
		for(int i=texto.length()-1;i>=0;i--) {
			invertido=invertido + texto.charAt(i);
		}
		
		System.out.println(invertido);
	}

}
