
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,2143,234,56,3,5,3,1,90};
		int num=5;
		int i=0;
		while(i<arr.length-1) {
			if(num==arr[i]) {
				System.out.println(arr[i]);
			}
			i++;
		}
	}

}
