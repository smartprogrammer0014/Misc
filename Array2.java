class Array2
{
	public static void main(String[] args) {
		
		int[] arr={34,15,29,8};
		int n=arr.length;

		for(int i=0;i<n;i++)
		{
			int min_index = i;
			System.out.println("At index no is= "+ i);
			System.out.println("At index no is= "+ min_index);
			System.out.println("Array Length is= "+arr[min_index]);
			System.out.println("Array Length is= "+arr[i]);
		}
	}
}