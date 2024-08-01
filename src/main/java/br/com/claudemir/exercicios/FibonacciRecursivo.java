package br.com.claudemir.exercicios;

public class FibonacciRecursivo {

	public static void main(String[] args) {
		StringBuffer result = new StringBuffer();
		for(int i = 0; i <= 10; i++) {
			result.append(fib(i)).append("-");
		}
		result.delete(result.length()-1, result.length());
		System.out.println(result.toString());
		
	}
	
	private static int fib(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
		
	}


}
