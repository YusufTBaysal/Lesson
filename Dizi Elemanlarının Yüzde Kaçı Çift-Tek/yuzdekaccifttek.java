import java.util.*;

public class yuzdekaccifttek {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int[] dizi=new int[6];
		double ciftsayi=0;
		double teksayi=0;
		for (int index = 0; index < dizi.length; index++) {
			dizi[index]=k.nextInt();
			if(dizi[index]%2==0) {
				ciftsayi++;
			}
			if(dizi[index]%2==1) {
				teksayi++;
			}
		}
		System.out.println("Say�lar�n %"+ciftsayi*100/dizi.length+"'si �ift say�d�r.");
		System.out.println("Say�lar�n %"+teksayi*100/dizi.length+"'si tek say�d�r.");
	}
}
