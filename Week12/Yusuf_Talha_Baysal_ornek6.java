import java.util.*;
public class ornek6 {

	public static final int N=4;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int satir,sutun,bosluk;
		for(satir = N; satir>=1; satir--) {
			
			for(int bosluk1=1; bosluk1<=(N+(-1*satir));bosluk1++){
				System.out.print(" ");
			}
			System.out.print(satir);
			
			for(int bosluk2=1; bosluk2<=(satir*2-1); bosluk2++) {
				System.out.print(" ");
			}
			System.out.println(satir);
		}
	
		
		

}
}