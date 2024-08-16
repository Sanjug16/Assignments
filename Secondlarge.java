import java.util.*;
public class Secondlarge {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6,7,89,3,4};
		int g = arr[0];
		int sg =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > g) {
				sg = g;
				g = arr[i];
			}
		}
		System.out.println("Second greatest element among the array is:" + sg);

	}

}
