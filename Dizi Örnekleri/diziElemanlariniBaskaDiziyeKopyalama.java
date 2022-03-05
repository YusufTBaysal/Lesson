import java.util.*;
public class diziElemanlariniBaskaDiziyeKopyalama {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		int n;
		System.out.print("Dizi boyutu giriniz: ");
		n=input.nextInt();
		int[] dizi1 = new int[n];
		int[] dizi2 = new int[dizi1.length];
		for(int dongu=0;dongu<dizi1.length;dongu++) {
			System.out.print("Dizi elemaný giriniz: ");
			dizi1[dongu] = input.nextInt();
			dizi2[dongu] = dizi1[dongu];
			System.out.println("dizi1 elemaný = "+dizi1[dongu]+" "+"dizi2 elemaný = "+dizi2[dongu]);
			
		}
		

	}

}
