import java.util.*;
public class recursiveFactorial {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir deðer giriniz: ");
		int deger=input.nextInt();
		System.out.println(fakt(deger));
		}
		
		public static int fakt(int sayi) {
			if(sayi==1) {
				return 1;
			}
			else {
				return sayi*fakt(sayi-1);
			}
		}
}
	


