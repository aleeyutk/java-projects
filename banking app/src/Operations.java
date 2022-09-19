import java.util.Scanner;

public class Operations {

		//Class Variables
		private int balance;
		private int previousTransaction;
		String customerName;
		String customerID;
		
		
		//Function for creating new account
		void account(String fullname, String age, String accType) {
			System.out.println(".............................");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your name(Surname first)>>");
			fullname=scanner.nextLine();
			System.out.println("Enter age>>>");
			age=scanner.nextLine();
			System.out.println("Enter account type (Saving, Current or Student)>>");
			accType=scanner.nextLine();
			System.out.println("....................................");
			System.out.println("your account is successfully created.\nBelow is your new account details...");
			System.out.println("====================================");
			System.out.println("Account Name: "+ fullname.toUpperCase());
			long a = generateAccNo();
			System.out.println("Accouunt Number: "+ a);
			System.out.println("Account type: "+ accType.toUpperCase()+" Account");
		}
		
		//Function for generating account number
		long generateAccNo() {
			long AccNumber;
			AccNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			return AccNumber;
		}
		
		//Function for Depositing money
		void deposit(int amount) {
			if (amount != 0) {
				balance = balance + amount;
				previousTransaction = amount;
			}
		}
		
		//Function for Withdrawing money
		void withdraw(int amount) {
			if (amount <= balance) {
				balance = balance - amount;
				previousTransaction = amount;
			}
			else {
				System.out.println("Insufficient fund!");
			}
		}
		
		//Function showing the previous transaction
		void getPreviousTransaction() {
			if (previousTransaction > 0) {
				System.out.println("Deposited: " + previousTransaction);
			} else if (previousTransaction < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTransaction));
			} else {
				System.out.println("No transaction occurred");
			}
		}
		
		//Function showing the main menu
		void showMenu() {
			char option = '\0';
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome, " +  "to my bank app!");
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("A. Create new account");
			System.out.println("B. Check your balance");
			System.out.println("C. Make a deposit");
			System.out.println("D. Make a withdrawal");
			System.out.println("E. View previous transaction");
			
			System.out.println("G. Exit");
			
			do {
				System.out.println();
				System.out.println("Enter an option: ");
				char option1 = scanner.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				
				//Case 'B' allows the user to check their account balance
				case 'B':
					System.out.println("====================================");
					System.out.println("Balance = $" + balance);
					System.out.println("====================================");
					System.out.println();
					break;
				
					//Case 'C' allows the user to deposit money into their account using the 'deposit' function
				case 'C':
					System.out.println("Enter an amount to deposit: ");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println();
					break;
				
					//Case 'D' allows the user to withdraw money from their account using the 'withdraw' function
				case 'D':
					System.out.println("Enter an amount to withdraw: ");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("you have successfully withdrawn: $"+amount2);
					break;
				
					//Case 'E' allows the user to view their most recent transaction using the 'getPreviousTransaction' function
				case 'E':
					System.out.println("====================================");
					getPreviousTransaction();
					System.out.println("====================================");
					System.out.println();
					break;
				
					//Case 'F' generates a fixed size random number
				case 'F':
					System.out.println(generateAccNo());
					
					break;
				
					//Case 'G' exits the user from their account
				case 'G':
					System.out.println("================================");
					break;
					//case 'A' allows user to input information
				case 'A':
					account(customerID, customerName, customerID);
					System.out.println("====================================");
					break;
				//The default case let's the user know that they entered an invalid character and how to enter a valid one
				default:
					System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
					break;
				}
				
			} while(option != 'G');
			System.out.println("Thank you for banking with us!");
		}
		
	}

