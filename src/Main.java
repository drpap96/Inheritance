
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1= new BankAccount("John",1900); //Δημιουργια αντικειμενου υπερκλάσης
		
		ba1.printData();//κληση μεθοδου υπερκλασης
		
		SavingsAccount sa1= new SavingsAccount("Roberts",800,0.5); //δημιουργια αντικειμενου υποκλασης
		sa1.printData(); //κληση μεθοδου υποκλασης,ΕΧΕΙ ΞΑΝΑ ΟΡΙΣΤΕΙ.
		
		sa1.addInterest();//κληση μεθοδου υποκλασης
		
	}

}
