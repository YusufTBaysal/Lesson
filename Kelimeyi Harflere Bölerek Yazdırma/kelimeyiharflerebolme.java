import java.util.*;
public class kelimeyiharflerebolme {

	public static void main(String[] args) {
			
		Scanner k = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String anahtar = k.next();
		int index=0;
		System.out.println("Kelimeyi kaçarlý harflere böleceðinizi giriniz: ");
		int bolen=k.nextInt();
		for (int i = 0; i < anahtar.length()/bolen; i++) {
			 System.out.println(anahtar.substring(index,index+bolen));
			 index+=bolen;
	    }
		 System.out.println(anahtar.substring(index,anahtar.length()));
		 

	}

}
