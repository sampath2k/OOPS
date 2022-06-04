
public class Smallestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40,20,10,50,70,30};
		int min=Integer.MAX_VALUE;
		int i=0;
		while(i<arr.length-1) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
			
			i++;
			
		}
		System.out.println(min);

	}

}
