import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;


public class TicketingSystem {
	
	static Scanner input = new Scanner(System.in);
	//Outputs login menu and retrieves input of user menu selection
	public static int loginMenu() {
		int selection;
		Scanner input = new Scanner(System.in);
		
		System.out.println("***Login Menu***");
		System.out.println("[1] Login");
		System.out.println("[2] Reset Password");
		System.out.println("[3] Create Account");
		System.out.println("[4] Exit");
		
		selection = input.nextInt();
		return selection;
	}
	//Login code
	public static void login() {
		TicketSystem ts = new TicketSystem();
		
	}
	
	public static boolean
    isValidPassword(String password)
    {
  
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);
  
        // Return if the password
        // matched the ReGex
        return m.matches();
    }
	//Create Account 
	private static void createAcc() {
		String password;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your username: \n");
		String username = input.nextLine();
		
		//3 Attempts to enter valid password
		for(int i = 0; i < 3; i++){
			System.out.println("Enter your password: \n");
			password = input.nextLine();
			//If valid password, Account is now created
			if(isValidPassword(password) == true) {
				i = 3;
				System.out.println("Please enter your full name: \n");
				String name = input.nextLine();
				
				System.out.println("Please enter your email: \n");
				String email = input.nextLine();
				
				System.out.println("Please enter your mobile number: \n");
				int mobileNo = input.nextInt();
				
			Technician t6 = new Technician(name,1,username,password);
			//Verification of Account Creation
			System.out.println("Account Created");
			}
			// Output failed account creation after 3 invalid password attempts.
			if(isValidPassword(password) == false && i > 2) {
				System.out.println("Failed to create account");
			}
		};
			
		
		
	}
	

	public static void main(String[] args) {
		// New ticket system created
		TicketSystem ts = new TicketSystem();
		
		// Technicians created
		Technician t1 = new Technician("Harry Styles", 1, "HStyles", "Styles1");
		Technician t2 = new Technician("Niall Horan", 1, "NHoran", "Horan1");
		Technician t3 = new Technician("Liam Payne", 1, "LPyane", "Payne1");
		Technician t4 = new Technician("Louis Tomlinson", 2, "LTomlinson", "Tomlinson1");
		Technician t5 = new Technician("Zayn Malik", 2, "ZMalik", "Malik1");
		
		// Technicians added to system.
		ts.addTechnician(t1);
		ts.addTechnician(t2);
		ts.addTechnician(t3);
		ts.addTechnician(t4);
		ts.addTechnician(t5);
		
		
		
		int userChoice;
		boolean success = false;
		// Loop for login
		do {
		userChoice = loginMenu();
		if(userChoice == 1) {
			
			System.out.println("Please enter your username: ");
			String username = input.nextLine();
			System.out.println("Please enter your password: ");
			String password = input.nextLine();
			//Login Attempt for T1
			if(t1.getUsername().contentEquals(username)) {
				if(t1.getPassword().contentEquals(password)) {
					System.out.println("Login Succesful");
					success = true;
				}
			}
			//Login Attempt for T2
			else if(t2.getUsername().contentEquals(username)) {
				if(t2.getPassword().contentEquals(password)) {
					System.out.println("Login Successful");
					success = true;
				}
			}
			//Login Attempt for T3
			else if(t3.getUsername().contentEquals(username)) {
				if(t3.getPassword().contentEquals(password)) {
					System.out.println("Login Successful");
					success = true;
				}
			}
			//Login Attempt for T4
			else if(t4.getUsername().contentEquals(username)) {
				if(t4.getPassword().contentEquals(password)) {
					System.out.println("Login Successful");
					success = true;
				}
			}
			//Login Attempt for T5
			else if(t5.getUsername().contentEquals(username)) {
				if(t5.getPassword().contentEquals(password)) {
					System.out.println("Login Successful");
					success = true;
				}
			}
			if(success == false) {
				System.out.println("Invalid Login");
			}
			//Reset Password
		}else if(userChoice == 2) {
			
			System.out.println("Please enter your username: ");
			String username = input.nextLine();
			
			System.out.println("Please enter your new password: ");
			String password = input.nextLine();
			
			//Code to confirm resetting of password
			
		}else if(userChoice == 3) {
			createAcc();
		}else if (userChoice == 4) {
			System.out.println("Closing Program...");
			System.exit(0);
		}
		}while (success == false);
		
		
	}

	

}
