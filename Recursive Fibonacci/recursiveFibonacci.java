import java.util.*;
public class recursiveFibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir deðer giriniz: ");
		int deger=input.nextInt();
		System.out.println(fibonacci(deger));
		

	}
	
	public static int fibonacci(int sayi) {
		if(sayi<=2)
			return 1;
		else
			return fibonacci(sayi-1)+fibonacci(sayi-2);
	}
}
