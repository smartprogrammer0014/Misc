class FiboMethod
{
	 static int fibo(int n)
	{
		if(n<=1)
			return n;
		else
			return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
	
	System.out.println("The Fibonacii no is= "+fibo(0));
		System.out.println("The Fibonacii no is= "+fibo(1));
		System.out.println("The Fibonacii no is= "+fibo(2));
		System.out.println("The Fibonacii no is= "+fibo(3));
		System.out.println("The Fibonacii no is= "+fibo(4));
		System.out.println("The Fibonacii no is= "+fibo(5));
		System.out.println("The Fibonacii no is= "+fibo(6));
		System.out.println("The Fibonacii no is= "+fibo(7));
	}
}