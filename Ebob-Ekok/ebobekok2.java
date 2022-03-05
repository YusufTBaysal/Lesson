import java.util.Scanner;
public class ebobekok2 {
	

		public static void main(String[] args) {
			Scanner k=new Scanner(System.in);
			
			int ebob=1;
			int ekok=1;
			int sayi1,sayi2;
			System.out.print("sayi1 deðerini giriniz: ");
			sayi1=k.nextInt();
			System.out.print("sayi2 deðerini giriniz: ");
			sayi2=k.nextInt();
			
			if(sayi1>sayi2) {
				for(int i=2;i<sayi2;i++) {
					if(sayi2 % i==0 && sayi1%i==0) {
						ebob=i;
					}
				}
			}
			
			else if(sayi1==sayi2) {
				ebob=sayi1;
			}
			
			else{
				for(int i=2;i<sayi1;i++) {
					if(sayi2%i==0 && sayi1%i==0) {
						ebob=i;
					}
				}
			}
			ekok=(sayi1*sayi2)/ebob;
			System.out.println(sayi1 + " ve "+sayi2+ " sayýlarýnýn Ebob'u = " + ebob + "\n"+sayi1 + " ve " + sayi2 + " sayýlarýnýn Ekok'u = " + ekok);
				
			
		}

	}


