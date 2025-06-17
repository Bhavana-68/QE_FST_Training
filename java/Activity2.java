package activities;

public class Activity2 {
	public static void main(String [] args) {
		int sum1 = 0;
		int[] arr1 = {10,77,10,54,-11,10};
		for (int x : arr1) {
			if(x == 10) {
				sum1 = sum1 + 10;
			}
				
		}
		System.out.println(sum1);
	}
	

}
