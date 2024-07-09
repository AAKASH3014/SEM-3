import java.util.Scanner;

class BankAccount{
	private int acc_no;
	private String name;
	private double balance;

	public BankAccount(int acc_no,String name,double balance){
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}

	public void checkBalance(){
		System.out.print("\nBalance for account no "+acc_no+" is : "+balance);
	}

	public void withdraw(double amt){
		if(amt<0 || amt>balance){
			System.out.print("\nInvalid input");
		}
		else{
			balance -= amt;
			System.out.print(amt+" is withdrawn from account no "+acc_no+" ,Balance is "+balance);
		}
	}

	public void deposit(double dep){
		if(dep<0){
			System.out.print("\nInvalid input");
		}
		else{
			balance += dep;
			System.out.print(dep+" is deposited from account no "+acc_no+" ,Balance is "+balance);
		}
	}
}

public class Bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BankAccount[] a = new BankAccount[3];
		a[0] = new BankAccount(1,"Ajay",20000);
		a[1] = new BankAccount(2,"Aman",25000);
		a[2] = new BankAccount(3,"Paresh",30000);

		int temp = 0;
		while(temp!=4){
			System.out.print("\nEnter account no (between 1 and 3) : ");
			int acc_no = sc.nextInt();

			System.out.print("\nPress \n1 to Check Balance \n2 to deposit and \n3 to withdraw : \n4 to exit : ");
			temp = sc.nextInt();

			if(temp==1){
				a[acc_no-1].checkBalance();
			}
			else if(temp==2){
				System.out.print("\nEnter amount to deposit : ");
				double amt = sc.nextDouble();
				a[acc_no-1].deposit(amt);
			}
			else if(temp==3){
				System.out.print("\nEnter amount to withdraw : ");
				double dep = sc.nextDouble();
				a[acc_no-1].withdraw(dep);
			} 
			else if(temp==4){
				break;
			}
			else{
				System.out.print("\nInvalid input");
			}
		}
	}
}