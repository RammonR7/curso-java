package padroes.strategy;

import java.text.DecimalFormat;

public class ParceladoTres implements StrategyPagament {
	
	DecimalFormat formato = new DecimalFormat("#.00");

	
		public String efetuarPagamento(double total) {
			total+= total*0.1;
				return formato.format(total);
	}

	
		public String calcularParcela(double total) {
			total+= total*0.1;
				return formato.format(total/3);
	}

}
