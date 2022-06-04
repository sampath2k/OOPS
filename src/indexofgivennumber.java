
public class indexofgivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,4,34,231,54,65};
		int i=0;
		int num=54;
		while(i<arr.length-1) {
			if(num==arr[i]) {
				System.out.println(i);
			}
			i++;
		}

	}

}
