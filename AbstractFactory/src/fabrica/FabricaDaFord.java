package fabrica;

public class FabricaDaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		// TODO Auto-generated method stub
		return new Monza();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		// TODO Auto-generated method stub
		return new Ka();
	}

}
