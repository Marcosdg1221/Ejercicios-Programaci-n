package Exercises;

import java.util.Scanner;

public class Exercises4 {
	public static void main(String[] args) {
		//Crear el scanner todo
		Scanner sc = new Scanner(System.in);
		//Pido al usuario la longitud y área de un círculo, creo las dos variables y lo 
		//que escriba el usuario serán los valores de esas variables.
		System.out.print("Dime la longitud de un círculo");
		float longitud;
		longitud = sc.nextFloat();
		System.out.print("Introduce su area");
		float area;
		//creo la variable total, tendrá el valor de la fórmula del círculo, y luego se lo mostrará
		double total = (Math.PI * 2 * longitud / 2);
		total = sc.nextFloat();
		System.out.println("Resultado es " + total);
		}
}
