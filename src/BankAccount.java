//ΥΠΕΡΚΛΑΣΗ-SuperClass 
public class BankAccount {
	
	protected String name; //ιδιοτητες ΥΠΕΡΚΛΑΣΗΣ
	protected double balance; //ιδιοτητες ΥΠΕΡΚΛΑΣΗΣ
	
//Κατασκευαστης υπερκλάσης	
    public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}


//ΜΕΘΟΔΟΣ ΕΚΤΥΠΩΣΗΣ ΣΤΟΙΧΕΙΩΝ ΥΠΕΡΚΛΑΣΗΣ
	public void printData() {
		System.out.println("Holder's name: "+name);
		System.out.println("Balance: "+ balance);
	}
	

	public String getName() {
		return name;
	}
    void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	

}
