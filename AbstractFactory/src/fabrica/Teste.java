package fabrica;

public class Teste {

	public static void main(String[] args) {
	
		
		FabricaDeCarro fc = new FabricaFiat();
		CarroPopular popular = fc.criarCarroPopular();
		CarroSedan sedan = fc.criarCarroSedan();
		popular.exibirCarro();
		sedan.exiberCarro();
		   
		System.out.println();
		
		fc = new FabricaDaFord();
		popular = fc.criarCarroPopular();
		sedan = fc.criarCarroSedan();
		popular.exibirCarro();
		sedan.exiberCarro();

	}

}
