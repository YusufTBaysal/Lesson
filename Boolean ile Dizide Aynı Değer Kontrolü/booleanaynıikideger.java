import java.util.*;
public class booleanayn�ikideger {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int[] dizi = {1,2,3,4,5,6,3,7,8,9};
		System.out.println(ayn�deger(dizi));
		
	}
	
	public static boolean ayn�deger(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int count = index+1; count < arr.length; count++) {
				if(arr[index]==arr[count]) {
					return false;
				}
			}
		}
		return true;
	}

}
