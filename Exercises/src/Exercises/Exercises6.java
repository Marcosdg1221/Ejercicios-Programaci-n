package Exercises;

import java.util.Scanner;

public class Exercises6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre");
		String nombre;
		nombre = sc.nextLine();
		System.out.print("Introduce tu dirección");
		String direccion;
		direccion = sc.nextLine();
		System.out.print("Introduce tu telefono");
		int telefono;
		telefono = sc.nextInt();
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Nombre: " + telefono); //comentario
}
}	