
public class Timespresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,40,30,10,50,30,90,70};
		int num=30;
		int i=0;
		byte count=0;
		while(i<arr.length) {
			if(arr[i]==num) {
				count++;
			}
			i++;
				
		}
		System.out.println(count);

	}

}
