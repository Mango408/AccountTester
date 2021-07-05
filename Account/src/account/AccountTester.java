
package account;

import java.util.Scanner;

public class AccountTester {
  public static Scanner in = new Scanner(System.in);
  
  public static void clearScreen(){
      System.out.print("\nPress CTRL + L, then ENTER");
      in.nextLine(); in.nextLine();
  }
    
  public static void main(String[] args) {
        Account account = new Account(100.00);       
        
        int choice = 6; double value;
        
        
        while (choice != 5) {
            System.out.print("1.Credit Account\n2.View Balance\n3.Debit Account\n4.View last 5 transactions\n5.Exit\n>");
            choice = in.nextInt();
            clearScreen();            
            switch(choice) {                
                case 1:{
                    System.out.println("How much do you want to deposit ");
                    value = in.nextDouble();
                    account.Credit(value);                    
                    account.manageStatements("Credited: " + value);
                    clearScreen(); 
                }break;
                case 2:{
                    System.out.println("Your account balance is "+ account.getBalance());
                    clearScreen(); 
                }break;
                case 3:{
                    System.out.print("Enter withdrawal amount ");
                    value = in.nextDouble();                    
                    if(account.debit(value))
                        account.manageStatements("Debited: " + value);                    
                    clearScreen(); 
                }break;
                case 4:{         
                    account.displayStatements();
                    clearScreen(); 
                }break;
            }   
        }
    }  
}
