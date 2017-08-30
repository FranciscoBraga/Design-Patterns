package br.com.builder;

public class Teste {
	
	public static void main(String[] args) {
	
		BoletoBuilder bb = new BBBoletoBuilder();
		
		GeradorBoleto gb = new GeradorBoleto(bb);
		
		Boleto boleto = gb.geraBoleto();
	    System.out.println(boleto);
	
	}

}
