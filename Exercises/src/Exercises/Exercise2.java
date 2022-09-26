package Exercises;

import java.util.Scanner;

public class Exercise2 {
	
				public static void main(String[] args) {
					//creo el scanner todo
					Scanner todo = new Scanner(System.in);
					//pido al usuario su fecha de nacimiento
					System.out.print("¿Cuando naciste?");
					//creo la variable numero
					float numero;
					//el número que escriba el usuario será esa variable
					numero = todo.nextFloat(); 
					 //pido la fecha actual al usuario
					System.out.print("¿Cual es la fecha de hoy?");
					float fecha;
					 //la fecha que escriba el usuario será el valor de esa variable
					fecha = todo.nextFloat();
					//la variable float se fija a la resta de la fecha y el número
					float total = (fecha - numero);
					//muestro al usuario su edad con la variable total.
					System.out.println("Tienes: " + total);
					}
			}