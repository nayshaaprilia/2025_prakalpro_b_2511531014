package tugaspekan2;
import java.util.Scanner;
public class DataMahasiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in );
        
		// input data mahasiswa
		System.out.print("Masukan NIM:");
		String nim = input.nextLine();
		
		System.out.print("Masukan NAMA:");
		String nama = input.nextLine();
		
		System.out.print("Masukan UMUR:");
		int umur = input.nextInt();
		

		System.out.print("Masukan IPK:");
		int ipk = input.nextInt();
	
		// lakukan konversi umur ke string
		String umurStr = Integer.toString(umur);
		
		// lakukan konversi NIM ke long lalu tambahkan umur
		long nimlong = Long.parseLong(nim);
		long hasilJumlah = nimlong + umur ;
				
		// cetak hasil
		System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("IPK   : " + ipk);  
        System.out.println("\nUmur (String): " + umurStr);
        System.out.println("NIM + Umur   : " + hasilJumlah);

       
		
	}
	

}
