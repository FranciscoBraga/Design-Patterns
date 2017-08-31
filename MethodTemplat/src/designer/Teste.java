package designer;

public class Teste {

	public static void main(String[] args) {
		
		Conta c = new Poupanca();
		
		
		Double saldoPoupanca = c.Deposito(200.00)-(c.Sacar(100.00)+c.Taxa());
		System.out.println(saldoPoupanca);
		
		c  = new Corrente();
		Double saldoCorrente = c.Deposito(300.00)-(c.Sacar(150.00)+c.Taxa());
		System.out.println(saldoCorrente);

	}

}
