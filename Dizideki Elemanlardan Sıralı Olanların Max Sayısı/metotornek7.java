
public class metotornek7 {

	public static void main(String[] args) {
		
		int list[]= {1,2,3,0,2,4,1,2,3,4,5};
		System.out.println(longestsortsequence(list));
	}
	
	public static int longestsortsequence(int[] list) {
		if(list.length==0) {
			return 0;
		}
		int count = 1;
		int max = 1;
		
		for(int index = 1 ; index < list.length ; index++) {
			if(list[index]>=list[index-1]) {
				count++;
			}
			else
				count=1;
		}
			if(count>max) {
				max=count;
			}
			return max;
	}

}
