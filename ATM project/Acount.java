import java.text.DecimalFormat;
import java.util.Scanner;
public class Acount {
 Scanner input = new Scanner(System.in);
 DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
 //Set customer number
 public int customerNumber(int customerNumber) {
	 this.customerNumber = customerNumber;
	 return customerNumber;
 }
 
 // get customer number
 public int getCustomerNumber(){
	 return customerNumber;
 }
 public int setPinNumber(int pinNumber) {
	 this.pinNumber= pinNumber;
	 return pinNumber;
 }
 //Get the pin number
 public int getPinNumber() {
	 return pinNumber;
 }
 public double getCheckingBalance() {
	 return checkingBalance;
 }
 public double getSavingBalance() {
	 return savingBalance;
 }
  public double calcCheckingWithdraw(double amount) {
	  checkingBalance=(checkingBalance - amount);
	  return checkingBalance;
  }
 
  public double calcSavingWithdraw(double amount) {
	  savingBalance = (savingBalance - amount);
	  return savingBalance;
  }
  
  public double calcCheckingDeposite(double amount) {
	  checkingBalance = (checkingBalance - amount);
	  return savingBalance;
  }
  
  public void getCheckingWithdrawInput() {
	  System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
     System.out.println("Amount you want to withdraw from Checking Account:");
     double amount = input.nextDouble();
     
     if((checkingBalance - amount) >=0) {
    	 calcCheckingWithdraw(amount);
    	 System.out.println("new checking account balance:" + moneyFormat.format(checkingBalance));
     }
     else {
    	 System.out.println("Blance cannot be negative."+"\n");
     }
     }
  public void getSavingWithdrawInput() {
	  System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
	  System.out.println("Amount you want to withdraw from savings account:");
	  double amount = input.nextDouble();
	  
	  if((savingBalance - amount)>=0) {
		  calcSavingWithdraw(amount);
		  System.out.println("New Saving Account Balance:" + savingBalance +"\n");
	  }
	  else {
		  System.out.println("balance cannot be negative" + "\n");
	  }
  }
   
  public void getCheckingDepositInput() {
	  System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
	  System.out.println("Amount you want to deposit from Checking Account:");
	  double amount = input.nextDouble();
	  
	  if ((checkingBalance + amount)>= 0) {
		  calcCheckingDeposite (amount);
		  System.out.println("New Checking Account balance:" + moneyFormat.format(checkingBalance));
	  }
	  else {
		  System.out.println("Balance cannot be negative."+"\n");
	  }
	  }
  private int customerNumber;
  private int pinNumber;
  private double checkingBalance = 0;
  private double savingBalance = 0;
  }
