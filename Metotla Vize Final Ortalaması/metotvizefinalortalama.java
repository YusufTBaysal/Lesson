import java.util.*;
public class metotvizefinalortalama {

	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		System.out.println("Öðrenci sayýsý giriniz: ");
		int ogrencisayisi=k.nextInt();
		double vizenotu;
		double finalnotu;
		double[] ortalama = new double[ogrencisayisi];

		for (int index = 0; index < ogrencisayisi; index++) {
			System.out.println(index+1+". öðrencinin vize notu giriniz: ");
			vizenotu=k.nextInt();
			System.out.println(index+1+". öðrencinin final notunu giriniz: ");
			finalnotu=k.nextInt();
			ortalama[index]=ortalama(vizenotu,finalnotu);
			
			}
		System.out.println(Arrays.toString(ortalama));
		}
	
	public static double vizenotuhesapla(double vizenot) {
		if(vizenot<=0) 
			return 0;
		
		if(vizenot>=100)
			return 100;
		
		return (vizenot*40)/100;
	}
	
	public static double finalnotuhesapla(double finalnot) {
		if(finalnot<=0) 
			return 0;
		
		if(finalnot>=100)
			return 100;
		
		return (finalnot*60)/100;
	}
	
	public static double ortalama(double vizenot, double finalnot) {
		double vizen =  vizenotuhesapla(vizenot);
		double finaln = finalnotuhesapla(finalnot);
		
		return vizen+finaln;
	}

}
