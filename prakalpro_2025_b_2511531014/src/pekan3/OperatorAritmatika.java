package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {//
		// TODO Auto-generated method stub
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("Input angka-1: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.print("operator Penjumlahan");
		hasil = A1 + A2; //penjumlahan
		System.out.println(" Hasil = " + hasil);
		System.out.print("operator Pengurangan");
		hasil = A1 - A2; //pengurangan
		System.out.println(" Hasil = " + hasil);
		System.out.print("operator Perkalian");
		hasil = A1 * A2; //perkalian
		System.out.println(" Hasil = " + hasil);
		System.out.print("operator hasil bagi");
		hasil = A1 / A2; //hasil bagi
		System.out.println(" Hasil = " + hasil);
		System.out.print("operator sisa bagi");
		hasil = A1 % A2; //sisa bagi
		System.out.println(" Hasil = " + hasil);
		

	}

}
