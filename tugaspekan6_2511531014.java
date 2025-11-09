package pekan6_2511531014;

import java.util.Random;

import java.util.Scanner;

public class tugaspekan6_2511531014 {

	public static void main(String[] args) {
		        
		    	Scanner input = new Scanner(System.in);
		        Random rand = new Random();

		        int tries = 0;
		        int sum = 0;
		        boolean menang = false;

		        while (tries < 5) {
		            tries++;
		            int dadu1 = rand.nextInt(6) + 1;
		            int dadu2 = rand.nextInt(6) + 1;
		            sum = dadu1 + dadu2;
		               System.out.println(dadu1+" + " +dadu2+ " = "+ sum);

		            if (sum == 7) {
		                System.out.println("Tebakan Anda Benar");
		                System.out.println("Anda menang setelah " +tries+ " percobaan!");
		                menang=true;
		                break;
		            } else {
		                System.out.println("Tebakan Anda Salah");
		                System.out.print("Apakah mau lempar dadu (ya/tidak?)");
						
						String jawab = input.nextLine();

		                if (!jawab.equals("ya")) {
		                    break;
		                }}}

		        if (!menang) {
		            System.out.println("Anda gagal menang");
		        }

		        input.close();
	}}


