package padroes.strategy;

public interface StrategyPagament {
	
	public String efetuarPagamento(double total);
	public String calcularParcela(double total);

}
