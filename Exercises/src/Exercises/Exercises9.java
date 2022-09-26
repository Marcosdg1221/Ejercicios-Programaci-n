package Exercises;

import java.util.*;

public class Exercises9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime una cantidad de euros para convertirlos en pesetas ");
		int euros; // barra n para intros.
		euros = sc.nextInt();
		int pesetas = (int) (euros * 166.386);
		System.out.println("/n Eso en pesetas son " + pesetas);
		
}	
}
