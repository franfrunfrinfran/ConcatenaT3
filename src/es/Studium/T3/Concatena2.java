package es.Studium.T3;

import java.util.Scanner;

public class Concatena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String cad1, cad2;
		
		System.out.println("Escriba una cadena");
		cad1=teclado.next();
		System.out.println("Escriba otra cadena");
		cad2=teclado.next();
		
		
		System.out.println("La cadena resultante es: "+cad1+" "+cad2);
		
		teclado.close();

	}

}
