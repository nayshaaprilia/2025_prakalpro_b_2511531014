package pekan3;

import java.util.Scanner;

public class OperatorAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("Input angka-1: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Assigment Penambahan");
		A1 += A2; //penambahan, sekarang A1 = 15
		System.out.println("Penambahan : " + A1);
		System.out.println("Assigment Pengurangan");
		A1 -= A2; //penambahan, sekarang A1 = 10
		System.out.println("Perngurangan : " + A1);
		System.out.println("Assigment Perkalian");
		A1 *= A2; //penambahan, sekarang A1 = 50
		System.out.println("Perkalian : " + A1);
		System.out.println("Assigment hasil bagi");
		A1 /= A2; //penambahan, sekarang A1 = 10
		System.out.println("Pembagian : " + A1);
		System.out.println("Assigment sisa bagi");
		A1 %= A2; //penambahan, sekarang A1 = 0
		System.out.println("Sisa bagi : " + A1);
		
		
		//
		
		

	}

}
