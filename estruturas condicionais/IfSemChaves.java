package estruturascondicionais.java;

public class IfSemChaves {

	public static void main(String[] args) {
// Revis�o mensal		
		 boolean MonthlyReview = true;
// Esse m�s         
		 boolean ThisMonth = !MonthlyReview;
		        if (!MonthlyReview)
// Nao poder� viajar at� que seja feita a revisao mensal            
		           System.out.println("You will not be able to travel until the monthly review is done.");

	}

}
