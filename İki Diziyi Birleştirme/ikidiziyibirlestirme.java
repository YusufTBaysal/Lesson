import java.util.*;
public class ikidiziyibirlestirme {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("dizi1 boyutu giriniz: ");
		int a=k.nextInt();
		System.out.println("dizi 2 boyutu giriniz: ");
		int b=k.nextInt();
		int[] dizi1=new int[a];
		int[] dizi2=new int[b];
		int[] dizi3=new int[dizi1.length+dizi2.length];
		for (int index = 0; index < dizi1.length; index++) {
			System.out.println("dizi1 elemanlarýný giriniz: ");
			dizi1[index]=k.nextInt();		
		}
		for (int index = 0; index < dizi2.length; index++) {
			System.out.println("dizi2 elemanlarýný giriniz: ");
			dizi2[index]=k.nextInt();
		}
		for (int index = 0; index < dizi1.length; index++) {
			dizi3[index]=dizi1[index];
		}
		for (int index = 0; index < dizi2.length; index++) {
			dizi3[index+dizi1.length]=dizi2[index];
		}
		for (int index = 0; index < dizi3.length; index++) {
			System.out.print(dizi3[index]+" ");
		}
		
	}

}
