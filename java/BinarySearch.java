<<<<<<< HEAD
package activities;

import java.util.Arrays;


public class BinarySearch{

	public static void main(String[] args) {
		// initialize array
		int[] arr = { 9, 6, 12, 5, 7 };

		Arrays.sort(arr);
		int target = 12;
		int index = binarySearch(arr, target);
		if (index >= 0) {
			System.out.println("Element " + target + " found at index: " + index);
		} else {
			System.out.println("Element " + target + " not found.");
		}
	}

	// Binary search method
	public static int binarySearch(int[] arr, int target) {
			int left = 0;
			int right = arr.length - 1;
			
			while (left <= right) {
				int mid = left + (right - left) / 2;
				
				if (arr[mid] == target) {
					return mid;
				} else if (arr[mid] < target) {
					left = mid + 1; 
				} else {
					right = mid - 1;
				}
			}
			return -1; // Target not found
	    
			}
}

=======
package activities;

import java.util.Arrays;


public class BinarySearch{

	public static void main(String[] args) {
		// initialize array
		int[] arr = { 9, 6, 12, 5, 7 };

		Arrays.sort(arr);
		int target = 12;
		int index = binarySearch(arr, target);
		if (index >= 0) {
			System.out.println("Element " + target + " found at index: " + index);
		} else {
			System.out.println("Element " + target + " not found.");
		}
	}

	// Binary search method
	public static int binarySearch(int[] arr, int target) {
			int left = 0;
			int right = arr.length - 1;
			
			while (left <= right) {
				int mid = left + (right - left) / 2;
				
				if (arr[mid] == target) {
					return mid;
				} else if (arr[mid] < target) {
					left = mid + 1; 
				} else {
					right = mid - 1;
				}
			}
			return -1; // Target not found
	    
			}
}

>>>>>>> 1b212e018afe4005821d6af533a4466626af9bdc
