package Java2_groupProject;

public class calculator {
	private int investmentAmount = 0;
	private int monthyInterestRate = 0;
	private int years = 0;
	private int futureValue = investmentAmount * (1 +  monthyInterestRate)^years * 12;
	
	//setter for investment amount
	public void setInvestmentAmount(int x) {
		investmentAmount = x;
	}
	
	//getter for investment amount
	public int getInvestmentAmount() {
		return investmentAmount;
	}
	
	//setter for monthly interest rate
	 public void setMonthlyInterestRate(int x) {
		 monthyInterestRate = x;
	 }
	 
	 //getter for monthly interest rate
	 public int getMonthlyInterestRate() {
		 return monthyInterestRate;
	 }
	 
	 //setter for years
	 public void years(int x) {
		 years = x;
	 }
	 
	 //getter for years
	 public int getYears() {
		 return years;
	 }

}
