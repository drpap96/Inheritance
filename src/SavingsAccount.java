//��������
public class SavingsAccount extends BankAccount {
	
	private double interestRate; //�������� ���������

//������������� ���������!
	public SavingsAccount(String name,double balance,double interestRate) {
		super(name,balance);//������� ����� ��� ������������ ��� ����������
		this.interestRate = interestRate; //�������� ���������
	}
//��������� ������� ���������� !
	public void printData() {
		super.printData(); //�������� � printData() ��� ����������
		System.out.println("Interest Rate: "+ interestRate); 

	}
//������� ���������
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
//������� ���������	
	public void addInterest() {
		balance=balance+ balance*interestRate;
	}
	
	
	
	
	

}
