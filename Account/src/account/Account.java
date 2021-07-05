
package account;
import java.util.ArrayList;
public class Account {
    private double balance;
    private ArrayList<String> statement = new ArrayList<String> ();
            
    public Account (double initialBalance) {
        if(initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public void Credit(double amount) {
        balance = balance + amount;   
    }

    public double getBalance(){
        return balance;
    }
    
    public void manageStatements(String transaction){
        statement.add(transaction);
    }
    
    public void displayStatements(){
        int count;
        
            if (statement.isEmpty())
                System.out.println("No transactions were found.");
            else if (statement.size() < 5){
                System.out.println("Your recent transactions:");
                for (count =0; count < statement.size(); count++)
                    System.out.println(statement.get(count));
            }
            else{
                System.out.println("Your recent transactions:");
                for (count =(statement.size() - 5); count < statement.size(); count++)
                    System.out.println(statement.get(count));
            }
        
    }

    public boolean debit(double amount){
        boolean successful = false;
        if (amount > balance){
            System.out.println("Not enough funds available!");
        }
        else {
            balance = balance-amount;
            successful = true;
        }
        return successful;
    }
}