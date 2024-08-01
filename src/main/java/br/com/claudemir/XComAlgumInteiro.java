package br.com.claudemir;

public class XComAlgumInteiro {
	public static void main(String[] args) {
		calculaAlgumX(13);
	}
	
	private static void calculaAlgumX(int x) {
		StringBuilder sb = new StringBuilder();
		for(int i = x ; i != 1;) {
			if(i % 2 == 0) {
				i = i/2;
			} else {
				i = i*3 + 1;
			}
			
			sb.append(i).append("-> ");
		}
		sb.delete(sb.length()-3, sb.length());
		System.out.println(sb.toString());
		
	}

}
