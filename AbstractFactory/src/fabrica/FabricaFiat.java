package fabrica;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		
		return new PalioSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		
		return new Palio();
	}

}
