import java.util.Scanner;

public class KdvHesabi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tutar Giriniz:");
		int tutar = scanner.nextInt();
		
		double kdvlitutar = (tutar * 0.18);
		
		System.out.println("Odemeniz Gereken Vergi Tutari: " + kdvlitutar);
	

	}

}
