public class Repeated {

	public static void main(String[] args) {
		int count =0;
		int rep = 0;
		int maxcount =0;
		int[] arr = {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3};
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count +=1;
				}
			}
			if(count > maxcount) {
				rep = arr[i];
			}
		}
		System.out.println("Most repeated number of the array is : " + rep);

	}

}