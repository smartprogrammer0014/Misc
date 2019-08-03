class DuplicateArr
{
	public void duplicate(int[] arr,int lenght)
	{
		for(int i=0;i<lenght;i++)
		{
			for(int j=i+1;j<lenght;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
	
		int[] my_arr={4,2,4,5,2,3,1};
		DuplicateArr dupArr = new DuplicateArr();
		int my_lenght=my_arr.length;
		dupArr.duplicate(my_arr,my_lenght);	
	}
}