class Array1
{
	public static int findIndex(int[] arr,int k)
	{
		//Checking element is present inside Array or not
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] my_arr = {1,2,8,4,5};

		System.out.println("The Index no is:"+findIndex(my_arr,4));
		System.out.println("The Index no is:"+findIndex(my_arr,8));
	
	}
		
}