class Array3
{
	public static void sort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			
				if(arr[j]<arr[i])
				
		temp=arr[j];
		//arr[j]=arr[i];
		arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		
		int[] arr={30,26,35,10};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Elements are= "+arr[i]);
		}

	}
}