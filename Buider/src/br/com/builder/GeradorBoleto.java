package br.com.builder;

import java.util.Calendar;

//gerar Boleto
public class GeradorBoleto {
	
	private BoletoBuilder boletoBuilder;
	
	public GeradorBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto() {
		
		this.boletoBuilder.buildSacado("Francisco Braga");
		
		this.boletoBuilder.buildCedente("Java");
		
		this.boletoBuilder.buildValor(100.50);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.buildVencimento(vencimento);
		
		this.boletoBuilder.buildNossoNumero(1234567890);
		
		Boleto boleto = this.boletoBuilder.getBoleto();
		
		return boleto;
		
	}

}
