
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1= new BankAccount("John",1900); //���������� ������������ ����������
		
		ba1.printData();//����� ������� ����������
		
		SavingsAccount sa1= new SavingsAccount("Roberts",800,0.5); //���������� ������������ ���������
		sa1.printData(); //����� ������� ���������,���� ���� �������.
		
		sa1.addInterest();//����� ������� ���������
		
	}

}
