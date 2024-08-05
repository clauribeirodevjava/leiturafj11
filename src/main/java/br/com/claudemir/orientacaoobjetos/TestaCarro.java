package br.com.claudemir.orientacaoobjetos;

class TestaCarro {
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		Motor motor = new Motor();
		motor.potencia = 200;
		motor.tipo = "v1";
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		meuCarro.motor = motor;
		// liga o carro
		meuCarro.liga();
		// acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println("Motor tipo: "+meuCarro.motor.tipo);
		System.out.println("Motor potencia: "+meuCarro.motor.potencia);
	
	}
}