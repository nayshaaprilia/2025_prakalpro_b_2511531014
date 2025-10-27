package pekan5;

public class tugasnastedfor4 {

	public static void main(String[] args) {
		int n = 5;

        for (int i = 1; i <= n; i++) {
            // cetak titik di depan
            for (int j = n; j > i; j--) {
                System.out.print(".");
            }
            // cetak angka
            System.out.print(i);
            // cetak titik di belakang
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            System.out.println();
	}}}