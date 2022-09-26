package Exercises;

import java.util.Scanner;

public class Exercises5 {
	public static void main(String[] args) {
		Scanner al = new Scanner(System.in);
		//Pido al usuario un número
		System.out.print("Introduce un número");
		//Creo la variable
		float numerone;
		//El valor será lo que escriba el usuario
		numerone = al.nextFloat();
		//Pido al usuario que escriba otro 	número
		System.out.print("Introduce otro");
		//Hago lo mismo con;
		float numerdos;
		numerdos = al.nextFloat();
		//Creo dos variables que hagan las operaciones
		float suma = (numerone + numerdos);
		float resta = (numerone - numerdos);
		float multi = (numerone * numerdos);
		float divi = (numerone / numerdos);
		//Muestro los resultados
		System.out.println("La suma de esos dos numeros es " + suma);
		System.out.println("La resta de esos dos numeros es " + resta);
		System.out.println("La multiplicación de esos dos numeros es " + multi);
		System.out.println("La división de esos dos numeros es " + divi);
	}
}
