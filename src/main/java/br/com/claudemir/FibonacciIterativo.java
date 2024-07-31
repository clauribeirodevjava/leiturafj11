package br.com.claudemir;

public class FibonacciIterativo {
	public static void main(String[] args) {
		for(int i = 0 ; ; i ++) {
			int fib = fib(i);
			if(fib > 100) {
				System.out.print(fib(i) + " ");
				break;
			}
			System.out.print(fib(i) + " ");
		}
	}
	

	private static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int a = 0;
		int b = 1;
		
		for(int i = 2; i <= n; i++) {
			b = a + b;
			a = b - a;
		}
		return b;
	}

}
