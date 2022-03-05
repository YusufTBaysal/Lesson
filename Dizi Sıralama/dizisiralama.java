import java.util.Arrays;
import java.util.Scanner;

public class dizisiralama {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("Dizi boyutu giriniz: ");
		int deger=k.nextInt();
		int dizi[] = new int[deger];
		int temp;
		for (int index = 0; index < dizi.length; index++) {
			System.out.println("Dizi elemanýný giriniz: ");
			dizi[index]=k.nextInt();
		}
		for (int i = 0; i< dizi.length; i++) {
			for (int j = i; j < dizi.length; j++) {
				if(dizi[i]>=dizi[j]) {
					temp=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(dizi));
	}

	}

