package br.com.singleton;

public class FabricaDeCarro {
	
	private static FabricaDeCarro instance = new FabricaDeCarro();
	
	//para  que não possa ser instanciada em qualquer lugar 
	// a não se a propria classe
	private FabricaDeCarro() {
		
	}
	
	public static FabricaDeCarro getInstace() {
		return instance;
	}
	

}
