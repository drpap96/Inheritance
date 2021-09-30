//ΥΠΟΚΛΑΣΗ
public class SavingsAccount extends BankAccount {
	
	private double interestRate; //ΙΔΙΟΤΗΤΑ ΥΠΟΚΛΑΣΗΣ

//ΚΑΤΑΣΚΕΥΑΣΤΗΣ ΥΠΟΚΛΑΣΗΣ!
	public SavingsAccount(String name,double balance,double interestRate) {
		super(name,balance);//Γινεται κληση του κατασκευαστη της υπερκλασης
		this.interestRate = interestRate; //ιδιοτητα υποκλασης
	}
//ΕΠΙΚΑΛΥΨΗ ΜΕΘΟΔΟΥ ΥΠΕΡΚΛΑΣΗΣ !
	public void printData() {
		super.printData(); //Καλειται η printData() της υπερκλάσης
		System.out.println("Interest Rate: "+ interestRate); 

	}
//Μεθοδος υποκλάσης
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
//Μεθοδος υποκλάσης	
	public void addInterest() {
		balance=balance+ balance*interestRate;
	}
	
	
	
	
	

}
