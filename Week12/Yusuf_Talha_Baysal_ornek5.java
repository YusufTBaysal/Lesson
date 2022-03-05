import java.util.*;
public class ornek5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz: ");
		String kelime = input.nextLine();
		
		System.out.println("Bir sayý giriniz: ");
		int sayi = input.nextInt();
		
		bolme(kelime,sayi);
	}
	
	public static void bolme(String str , int sayi) {
		int index=0;
		for(int count=0; count<str.length() / sayi ; count++) {
			System.out.println(str.substring(index,index+sayi));
			index = index + sayi;
		}
		
		System.out.println(str.substring(index,str.length()));
	}

}
