import java.util.*;
public class metotdiziortalamas� {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("Eleman say�s� giriniz: ");
		int elemansayisi=k.nextInt();
		double dizi[] = new double[elemansayisi];
		
		for (int index = 0; index < dizi.length; index++) {
			System.out.println("Dizinin elemanlar�n� giriniz: ");
			dizi[index]=k.nextInt();
		}
		double ortalama=ortalama(dizi);
		System.out.println(ortalama);
	}
	
	public static double ortalama(double[] dizi) {
		double top=0;
		for (int index = 0; index < dizi.length; index++) {
			top=top+dizi[index];
		}
		double ortalama=top/dizi.length;
		return ortalama;
	}
	
}
