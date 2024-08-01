package br.com.claudemir.exercicios;

public class Fatorial {

	public static void main(String[] args) {
		int fat = 1;
		
		for(int i = 0; i <=10; i++) {
			if(i == 0) {
				System.out.println("Fatorial de 0 é 1");
			} else {
				fat *= i;
				System.out.println("O fatorial de "+i + " é ("+(i-1)+"!)*"+i+" = "+fat);
			}
			
			
		}
	
	}

}
