import java.util.*;

public class ebobekok {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.print("sayi1 deðerini giriniz: ");
		int sayi1 = k.nextInt();
		System.out.print("sayi2 deðerini giriniz: ");
		int sayi2 = k.nextInt();
		int ebob = 1;
		int ekok = 1;
		
		for (int index = 1; index <= sayi1 && index <= sayi2; index++) {
			if (sayi1 % index == 0 && sayi2 % index == 0) {
				ebob = index;
			}

		}
		int a = (sayi1 * sayi2) / ebob;
		ekok = a;
		System.out.println(sayi1 + " ve "+sayi2+ " sayýlarýnýn Ebob'u = " + ebob + "\n"+sayi1 + " ve " + sayi2 + " sayýlarýnýn Ekok'u = " + ekok);
	}
}
