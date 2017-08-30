package br.com.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BBBoleto  implements Boleto{
	
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private  int nossoNumero;

	public BBBoleto(String sacado,String cedente, double valor, Calendar vencimento, int nossoNumero) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
		
	}
	
	@Override
	public String getSacado() {
		// TODO Auto-generated method stub
		return this.sacado;
	}

	@Override
	public String getCedente() {
		// TODO Auto-generated method stub
		return this.cedente;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	@Override
	public Calendar getVencimento() {
		// TODO Auto-generated method stub
		return this.vencimento;
	}

	@Override
	public int getNossoNumero() {
		// TODO Auto-generated method stub
		return this.nossoNumero;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Boleto BB");
		sb.append("\n");
		sb.append("Sacado: "+this.sacado);
		sb.append("\n");
		sb.append("Cedente: "+this.cedente);
		sb.append("\n");
		sb.append("Valor: "+this.valor);
		sb.append("\n");
		sb.append("Vencimento: "+this.sacado);
		sb.append("\n");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(this.vencimento.getTime());
		sb.append("Vencimento: "+ format);
		sb.append("\n");
		
		sb.append("Nosso Número :"+this.nossoNumero);
		sb.append("\n");
		
		return sb.toString();
		
		
	}

}
