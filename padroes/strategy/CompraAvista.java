package padroes.strategy;

public class CompraAvista implements StrategyPagament {

	
	public String efetuarPagamento(double total) {
		return String.valueOf(total);
	}

	
	public String calcularParcela(double total) {
		return String.valueOf(total);
	}

}
