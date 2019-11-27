package es.Studium.T3;

import java.util.Scanner;

public class ConcatenaT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Scanner teclado = new Scanner(System.in);
			
			String cad1, cad2, cad3;
			
			System.out.println("Escriba una cadena");
			cad1=teclado.next();
			System.out.println("Escriba otra cadena");
			cad2=teclado.next();
			cad3=cad1+cad2;
			
			System.out.println(String.format("La cadena '%s' concatenada con la cadena '%s', resulta '%s'",cad1, cad2, cad3));
			
			teclado.close();
	}

}
