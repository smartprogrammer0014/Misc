import java.util.Scanner;
class StrPalin
{
	public static void main(String[] args) {
		
		String str, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String for Palindrome= ");
		str = sc.nextLine();

		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse))
			System.out.println("Palindrome no hai");
		else
			System.out.println("Palindrome no  nhi hai");
	}
}