package Exercises;

import java.util.Scanner;

public class Exercises6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Pido al usuario su nombre;
		System.out.print("Introduce tu nombre");
		//Creo la variable de String para la cadena de caracteres
		String nombre;
		//Lo que escriba el usuario será su valor
		nombre = sc.nextLine();
		//Pido su dirección
		System.out.print("Introduce tu dirección");
		//Creo la variable de String para la cadena de caracteres
		String direccion;
		//Lo que escriba el usuario será su valor
		direccion = sc.nextLine();
		//Pido su nº teléfono 
		System.out.print("Introduce tu telefono");
		//creo el valor numérico para el teléfono
		int telefono;
		//Lo que escriba el usuario será su valor
		telefono = sc.nextInt();
		//Muestro los resultados
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Nombre: " + telefono);
}
}	
