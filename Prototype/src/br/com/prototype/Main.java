package br.com.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

//Objetivo: Possibilitar a criação de novos objetos a partir da cópia de objetos existentes.
public class Main {
	
	public static void main(String[] args) {
		
		String nome = "K19";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);

		Set<String> hashSet = new HashSet<String>();
		 
		 hashSet.add("curso");
		 hashSet.add("java");
		 hashSet.add("K19");
		 
		 Campanha campanha = new Campanha(nome, vencimento, hashSet);
		 System.out.println(campanha);
		 
		 Campanha clone = campanha.clone();
		 System.out.println(clone);
	}
	

}
