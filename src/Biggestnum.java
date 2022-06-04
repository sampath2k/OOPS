
public class Biggestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,20,150,40,80,60,90};
		int max=0;
		int i=0;
		while(i<arr.length) {
			if(arr[i]>max) {
				max=arr[i];
			}
			i++;
		}
		System.out.println(max);

	}

}
