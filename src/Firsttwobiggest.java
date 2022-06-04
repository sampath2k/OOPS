
public class Firsttwobiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {70,50,60,90,30,40,100};
		int max1=0;
		int max2=0;
		int i=0;
		while(i<arr.length-1) {
			if(arr[i]<arr[i+1]) {
				arr[i]=arr[i+1];
				arr[i+1]=arr[i];
			}
			else if(arr[i]>arr[i+1]) {
				arr[i+1]=arr[i];
				arr[i]=arr[i+1];
			}
			
			i++;
			
			
		}
		int j=0;
		while(j<arr.length) {
			System.out.println(arr[j]);
			j++;
			
		}
		
		

	}

}
