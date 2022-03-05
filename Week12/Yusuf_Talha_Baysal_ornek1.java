import java.util.*;

public class ornek1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int vizeNotu,finalNotu,ogrencisayisi;
		
		System.out.print("Öðrenci sayýsý giriniz: ");
				ogrencisayisi = input.nextInt();
				
		for(int count=1; count<=ogrencisayisi; count++) {
			
			System.out.print(count + ". öðrencinin vize notunu giriniz: ");
			vizeNotu = input.nextInt();
			
			System.out.print(count + ". öðrencinin final notu giriniz: ");
			finalNotu = input.nextInt();
			
			System.out.println("Öðrencinin vize notu= " + vizeNotuHesaplama(vizeNotu));
			System.out.println("Öðrencinin final notu= " + finalNotuHesaplama(finalNotu));
		}
		
			
	}
	
	public static double vizeNotuHesaplama(int vizeNotu) {
		double not=0.0;
		if(vizeNotu >= 80) {
			not = vizeNotu * 1.10;
		}
		else if(vizeNotu >= 60){
			not = vizeNotu * 1.05;
		}
		if(vizeNotu> 100){
			not = 100;
		}
		return not;
	}
	
	public static double finalNotuHesaplama(int finalNotu) {
		double not=0.0;
		if(finalNotu >=70) {
			not = finalNotu * 1.10;
		}
		else if(finalNotu >=40){
			not = finalNotu * 1.05;
		}
		if(finalNotu > 100){
			not = 100;
		}
		return not;
		

	}

}
