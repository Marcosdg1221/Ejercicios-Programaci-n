package Exercises;

import java.util.*;

public class Exercises8 {
	public static void main(String[] args) {
		//Creo el scanner
		Scanner sc = new Scanner(System.in);
		//Pido la cantidad de euros
		System.out.print("Dime una cantidad de euros para convertirlos en pesetas");
		//Creo la variable euros
		float euros; // barra n para intros.
		//El usuario escribirá el valor de la variable
		euros = sc.nextInt();
		//Creo la variable pesetas y le pongo la multiplicación
		float pesetas = (float) (euros * 166.386);
		//Muestra el resultado
		System.out.println("Eso en pesetas son " + pesetas);
}
}