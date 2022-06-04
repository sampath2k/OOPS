
public class Sorting {
	void sort() {
		int arr[]= {23,87,5,908,4,53,1,8};
		int i=0;
		
		
		while(i<arr.length) {
			int j=0;
			while(j<arr.length) {
				//System.out.println(j);
				if(arr[i]<arr[j]) {
					
				}
				else  {
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
				j++;
			}
			int l=0;
			while(l<arr.length) {
				System.out.print(arr[l]+" ");
				l++;
			}
			System.out.println();
			i++;
			//j++;
			
		}
		int k=0;
		while(k<arr.length) {
			//System.out.print(arr[k]+" ");
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting s=new Sorting();
		s.sort();

	}

}
