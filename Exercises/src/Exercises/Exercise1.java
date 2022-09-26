package Exercises;

import java.util.Scanner;

public class Exercise1 {
			public static void main(String[] args) {
				//creamos el scanner (cualquier nombre, en mi caso algo)
				Scanner algo= new Scanner(System.in);
				//pido al usuario la edad
				System.out.print("Dime tu edad");
				//creo la variable
				int numero;
				//el usuario que escriba el numero será esa variable
				numero = algo.nextInt();
				//creo otra variable
				int nm;
				//sumo uno a esa otra variable
				nm = (numero + 1);
				//muestro la edad del usuario en el año que viene poniendo esa variable sumada con uno
				System.out.println("El siguiente año tendrás: " +nm);
				}
		}
