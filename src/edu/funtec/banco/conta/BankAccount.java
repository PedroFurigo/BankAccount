package edu.funtec.banco.conta;
import edu.funtec.banco.conta.usuario.*;

public class BankAccount {

	public static void main(String[] args) {
		NewUser u1 = new NewUser("Carlos", 41234778, "0001", 530, "04/07/2023");
		u1.withdraw(200);
		u1.deposit(400);
		u1.calculateEarnings();
		u1.displayInformation();
	}

}
