package br.com.claudemir;

public class ForEncadeado {
	public static void main(String[] args) {
		for(int n = 1; n <=10; n++) {
			for(int m = 1; m <= n; m++) {
				System.out.print(n*m+" ");
			}
			System.out.println();
			
		}
	}

}
