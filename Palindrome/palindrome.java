import java.lang.reflect.Array;

public class palindrome {

	public static void main(String[] args) {
		String[] array = {"alpha","beta","beta","alpha"};
		System.out.println(palindrome(array));
	}

	public static boolean palindrome(String[] array) {
		for(int sayac = 0 ; sayac < array.length/2 ; sayac++) {
			if(!array[sayac].equals(array[array.length-1-sayac])) {
				return false;
			}		
		}
		return true;
		
	}
}
