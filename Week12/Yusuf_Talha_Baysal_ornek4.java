import java.util.*;
public class ornek4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir kelime giriniz: ");
		String kelime = input.nextLine();
		
		System.out.println("Girilen kelime = "+kelime);
		System.out.print("Girilen kelimenin tersi = " + kelimeninTersi(kelime));

	}
	
	public static String kelimeninTersi(String kelime) {
		String ters="";
		for(int index=kelime.length(); index>0; index--) {
			ters = ters + kelime.substring(index-1,index);
			
		}
		return ters;
	}

}
