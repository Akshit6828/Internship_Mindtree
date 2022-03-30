
@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class InterfaceFunctional {
	public static void main(String args[])
	{
		int a = 5;
		Square s = (int x) -> x * x;

		// parameter passed and return type must be same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}
