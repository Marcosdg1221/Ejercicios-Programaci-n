package Exercises;

import java.util.*;

public class Exercises10 {

	public static void main(String[] args) {
		//Doy el scanner 
		Scanner sc = new Scanner(System.in);
		Float precio;
		final float IVA = (float) (21); // (barra n para intros, al poner system out print, luego de "", y luego el numero (con antes poniendo su +, el resto lo toma como cadena, así que no hagas una operación ahí, pon una variable nueva que haga el cálculo) 
		//Pregunto al usuario el precio de un item
		System.out.print("Dime un precio ");
		//Creo la variable euro
		//Lo que ponga el usuario será el valor del precio
		precio= sc.nextFloat();
		//Pongo una variable constante para hacer la fórmula del IVA
		precio = (float) (precio * IVA / 100 + precio);
		//Muestro el resultado.
		System.out.println("el precio con IVA es" + precio);	//primero las variables y luego lo demás
}	
}	

