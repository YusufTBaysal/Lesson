
public class forilepolindrome {

	public static void main(String[] args) {
		String kelimeler = "kabak"; 
		 
		  System.out.println(palindrome(kelimeler)); 
		 
		 } 
		 
		 public static boolean palindrome(String a) { 
		  int uzunluk = a.length(); 
		  for (int index = 0; index < uzunluk; index++) { 
		   if (a.charAt(index) != a.charAt(a.length() - 1-index)) { 
		    return false; 
		   } 
		 
		  } 
		  return true;
	}
	}



