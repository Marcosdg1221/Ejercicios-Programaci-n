package Exercises;

import java.util.*;

public class Exercises7 {
	public static void main(String[] args) {
		
		//Crear el scanner as
		
		Scanner as = new Scanner(System.in);
		
		//Pido el nombre al usuario
		
		System.out.print("Introduce tu nombre");
		
		//Creo la variable nombre
		
		String nombre;
		
		//El texto que ponga el usuario será el valor de la variable nombre
		
		nombre = as.nextLine();
		
		//Pido al usuario su edad
		
		System.out.print("Introduce tu edad");
		
		//Creo la variable edad
		
		int edad;
		
		//La edad puesta será su valor
		
		edad = as.nextInt();
		
		//Muestro el texto de la siguiente manera;
		
		System.out.print("Hola " + nombre + ", Tienes " + edad + " años, ¡Qué mayor eres!");
}	
}