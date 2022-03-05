import java.util.*;
public class ornek3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin eleman sayýsýný giriniz: ");
		int elemansayisi = input.nextInt();
		
		int[] dizi = new int[elemansayisi];
		for(int index = 0; index<dizi.length; index++) {
			System.out.print("Dizi elemaný giriniz: ");
			dizi[index] = input.nextInt();
		}
		double ortalama = ortalama(dizi);
		System.out.println(ortalama);
		
		
	}
	
	public static double ortalama(int[] dizi) {
		double ortalama;
		int total = 0;
		for(int index = 0; index<dizi.length; index++) {
			total = total +dizi[index];
		}
		ortalama = (double)total / dizi.length;
		return ortalama;
	}

}
