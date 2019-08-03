class LinearSearch
{
	public static int findIndex(int[] arr,int k)
	{
		//Checking Array is null or not
		if(arr==null)
		{
			return -1;
		}
		//Find length of the Array
		int length1 = arr.length;

		int i=0;
		while(i<length1)
		{
			if(arr[i]==k)
			{
				return i;
			}
			else
			{
				i=i+1;
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