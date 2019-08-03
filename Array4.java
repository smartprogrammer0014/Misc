class Array4
{
	public void duplicate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
	
		int[] my_arr={4,2,4,5,2,3,1};
		DuplicateArr dupArr = new DuplicateArr();
		dupArr.duplicate(my_arr);	
	}
}