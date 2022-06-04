
public class addnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {32,234,321,24,45,56,87};//7
		int num=298;
		int i=0;
		
		//arr[arr.length]=num;
		while(i<arr.length) {
			if(i==arr.length-1) {
			arr[i]=num;
			System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i]);
			}
			i++;
				
		}

	}

}
