import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
public class OptionMenu extends Acount {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat ("'$'###,##0,00");

	 HashMap<Integer , Integer> data = new HashMap<Integer, Integer>();
	/*validate login information customer number and pin*/
     public void getLogin() throws IOException{
	   int x=1;
	   do {
		   try {
			   data.put(123456789, 9988 );
			   data.put(987654321, 1122 );
			  
               System.out.println("welcome to the ATM Project");
			   System.out.println("Enter Your Acount Number:");
			  
               customerNumber(menuInput.nextInt());
			  
               System.out.println("Enter Your PIN Number: ");
			  
               setPinNumber(menuInput.nextInt());
		   
            } 
           catch(Exception e) {
			
            System.out.println("\n"+"Invalid Character entered. only numbers."+"\n");
			
            x=2;
		   }
		   
           for(Entry <Integer, Integer> entry : data.entrySet()) {
			   if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
		         {getAccountType();
		   }
	   }
	   System.out.println("\n" + "wrong Custom Number or Pin Number." + "\n");
       } 
       while (x == 1);
       }

    public void getAccountType() {
	System.out.println("Select The Account You Want To Access");
	System.out.println("Type1 - Checking Account");
	System.out.println("Type2 - Savings Account");
	System.out.println("Type3 - Exit");
	System.out.println("Choice:");
   
	selection = menuInput.nextInt();
	
	switch(selection) {
	case 1:
		getChecking();
		break;
		
	case 2:
		getSaving();
		break;
		
	case 3:
		System.out.println("Thank You For Using The ATM Bye!!!");
		break;

        default:
		System.out.println("\n"+"Invalid Choice"+"\n");
		getAccountType();
	}
	}
    public void getChecking() {
	  System.out.println("Checking Account:");
	  System.out.println("Type 1 - View Balance");
	  System.out.println("Type 2 - Withdraw Funds");
	  System.out.println("Type 3 - Deposite Funds");
	  System.out.println("Exit");
	  System.out.println("Choice:");
	  
	   selection = menuInput.nextInt();
	  
	  switch(selection) {
	  case 1: 
		  System.out.println("Current Account Balance:" + moneyFormat.format(getChecking()));
          getAccountType();
          break;
	  
	  case 2:
		  getCheckingWithdrawInput();
		  getAccountType();
		  break;
	  case 3: 
		  getCheckingDepositInput();
		  getAccountType();
		  break;
		  
	  case 4:
		  System.out.println("Thank You for using this ATM, bye!!! ");
		  break;
		  
		  default:
			  System.out.println("\n"+ "Invalid choice"+"\n");
			  getChecking();
	  }
    }
      public void getSaving( ) {
	  System.out.println("Saving Account: ");
	  System.out.println("Type 1 - View Balance");
	  System.out.println("Type 2 - Withdraw Funds");
	  System.out.println("Type 3 - Deposit Funds");
	  System.out.println("Type 4 - Exit ");
	  System.out.println("Choice");
    
	  selection = menuInput.nextInt();
	  
	  switch (selection) {
	  case 1: 
		  System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
		  getAccountType();
		  break;
		  
	  case 2:
		  getSavingWithdrawInput();
		  getAccountType();
		  break;
		  
     case 3:
    	 getCheckingDepositInput();
    	 getAccountType();
    	 break;
    	 
     case 4:
   	  System.out.println("\n" + "Invalid choice"+ "\n");
   	  getSaving();
    	 
	  }
    }
    int selection;
    }