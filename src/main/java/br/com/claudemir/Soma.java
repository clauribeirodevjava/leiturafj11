package br.com.claudemir;

public class Soma {
	public static void main(String[] args) {
         int j = 1;
         int l = 1000;
         int soma = 0;
		for(int i = j; i <= l; i++) {
			soma += i;
		}
		
		int soma2 = (l*(j+l))/2;
		
		System.out.println(soma);
		System.out.println(soma2);
	}
}
