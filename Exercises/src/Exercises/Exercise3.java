package Exercises;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		//Crear el scanner todo
		Scanner todo = new Scanner(System.in);
		//pide al usuario un numero
		System.out.print("Introduce un número");
		//crea la variable numerone
		float numerone;
		//la variable se fija a lo que escriba el usuario
		numerone = todo.nextFloat();
		//pido al usuario otro numero
		System.out.print("Introduce otro");
		//creo otra variable que tendrá el valor de lo que escriba el usuario
		float numerdos;
		numerdos = todo.nextFloat();
		//las variables se suman y dividen entre dos para dar la media
		float total = ((numerone + numerdos)/2);
		//Muestro el resultado
		System.out.println("La media de esos dos numeros es " + total);
		}
}
