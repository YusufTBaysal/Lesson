import java.util.*;
public class diziOrnek1 {
            
	public static void Main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("n giriniz");
		n=input.nextInt();
		int[] dizi=new int[n];
		
		for(int dongu=0;dongu<n; dongu++) {
			System.out.print("Eleman giriniz: ");
			dizi[dongu]=input.nextInt();	
		}
		for(int dongu2=n-1; dongu2>=0 ;dongu2--) {
			System.out.print(dizi[dongu2]+" ");
		}
		
	}
}
