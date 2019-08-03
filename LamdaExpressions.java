import java.util.function.*;
class LamdaExpressions
{
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;

		System.out.println("The square is"+f.apply(40));
		System.out.println("The square is"+f.apply(50));
	}
}