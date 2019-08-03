class SelectionEx
{
	public static void selectionSort(int[] arr)
	{
		int temp=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				
					minIndex=j;
			}
				temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
		}
	}

	public static void main(String[] args) {
		
		int[] my_arr={34,15,29,8};

		System.out.println("Array before Bubble sort=");
		for(int i=0;i<my_arr.length;i++)
		{
			System.out.print(+my_arr[i]+" ");
		}	
		selectionSort(my_arr);		//SORTING
		System.out.println(" ");
		System.out.println("Array after Bubble sort=");
		for(int i=0;i<my_arr.length;i++)
		{
			System.out.print(+my_arr[i]+" ");
		}
	}
}