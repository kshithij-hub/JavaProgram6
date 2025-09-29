package bankdetails;
import java.util.*;

public class Main {
	

	public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Account acc1 = new Account(2415113, "Kshithij", 13957.00);
        
        
        int option=0;
		
		do
		{
			System.out.println("\nYour Bank Menu");
			System.out.println("1.Amount to be Deposit: ");
			System.out.println("2. Amount to be Withdraw ");
			System.out.println("3. show Total Balance");
			System.out.println("4. Exit");
			try {
					option =scanner.nextInt();
					switch(option) {
					case 1:
						System.out.println("Enter Deposit Amount: ");
						double deposit = scanner.nextDouble();
						acc1.deposit(deposit);
						break;
					case 2:
						System.out.println("enter Amount to be withdrawn: ");
						double withdraw = scanner.nextDouble();
						acc1.withdraw(withdraw);
						break;
					case 3:
						acc1.ShowBalance();
						break;
					case 4:
						System.out.println("Thank you\n");
						System.out.println(" exiting as requested ");
						break;
					default:
						System.out.println("invalid choice!");
					}
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!! please enter only numbers");
			scanner.nextLine();
		}
		catch(ArithmeticException e) {
			System.out.println("Error!!"+ e.getMessage());
		}
		catch(InsufficientBalanceException e){
			System.out.println("Error!!"+ e.getMessage());
		}
		}while (option!= 4);
		scanner.close();
	}
}

 