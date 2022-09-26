package Exercises;

import java.util.Scanner;

public class Exercises5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número");
		float numerone;
		numerone = sc.nextFloat();
		System.out.print("Introduce otro");
		float numerdos;
		numerdos = sc.nextFloat();
		float suma = (numerone + numerdos);
		float resta = (numerone - numerdos);
		float multi = (numerone * numerdos);
		float divi = (numerone / numerdos);
		System.out.println("La suma de esos dos numeros es " + suma);
		System.out.println("La resta de esos dos numeros es " + resta);
		System.out.println("La multiplicación de esos dos numeros es " + multi);
		System.out.println("La división de esos dos numeros es " + divi);
	}
}
