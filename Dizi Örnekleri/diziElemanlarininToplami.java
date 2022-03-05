import java.util.Scanner;
public class diziElemanlarininToplami {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int sum=0;
		System.out.print("Dizi boyutu giriniz: ");
		n=input.nextInt();
		int[] dizi=new int[n];
        for(int dongu=0;dongu<n;dongu++) {
        	System.out.print("Bir dizi elemaný giriniz: ");
        	 dizi[dongu]=input.nextInt();
        	 sum=sum+dizi[dongu]; 
        }
        System.out.println("Dizi elemanlarýnýn toplamý="+sum);
        
	}

}
