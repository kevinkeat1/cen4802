
public class keatingAssign2 {
	
	public static int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}

	public static void main(String args[]) {
		int n = 10;
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacciRecursive(n));
	}
}
