package padroes.strategy;

public class Contexto {
	
	private StrategyPagament estrategia;
	public Contexto(StrategyPagament estrategia) {
		this.estrategia = estrategia;
	}
	public String efetuarPagamento(double total) {
		return estrategia.efetuarPagamento(total);
	}
	public String calcularParcela(double total) {
		return estrategia.calcularParcela(total);
	}

}
