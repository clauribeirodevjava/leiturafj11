package br.com.claudemir.exercicios.orientacaoaobjetosbasica;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Claudemir Ribeiro";
		cliente.cpf = "1231.123.123";
		cliente.sobrenome = "Ribeiro";
		Conta conta = new Conta();
		conta.titular = cliente;
		conta.numero = "251";
		conta.saldo = 100.000;
		
		
		System.out.println(conta.numero);
	}
}
