package estruturascondicionais.java;

public class IfSemChaves {

	public static void main(String[] args) {
// Revisão mensal		
		 boolean MonthlyReview = true;
// Esse mês         
		 boolean ThisMonth = !MonthlyReview;
		        if (!MonthlyReview)
// Nao poderá viajar até que seja feita a revisao mensal            
		           System.out.println("You will not be able to travel until the monthly review is done.");

	}

}
