//Unique ID : E7321008
package ca20;
import java.util.*;

public class Transfer {
  int pin,interest_rate,acct_num,acct_num1,interest;
  public int balance;
  public int amt,amt1;
  Scanner sc= new Scanner(System.in);
  public void info(){
    
    System.out.println("Enter the Account number:");
    int r1=sc.nextInt();
    System.out.println("Pin:");
    int r2=sc.nextInt();
    
  }
  public void dw(int r) {
      if (r==1) {
        deposit();
      }
      if (r==2) {
        withdraw();
      }
    }
  
  public void deposit() {
      System.out.println("Enter the amount you want to deposit: ");  
            amt = sc.nextInt();
            
            System.out.println("****** Deposit Successful *******\n____________________________\n____________________________\n ");  
      
    }
    public void withdraw() {
      System.out.println("Enter the amount you want to withdraw: ");  
          amt1 = sc.nextInt();  
       if (amt >= amt1) {  
                amt = amt - amt1;  
                System.out.println("****** Withdraw Successful ******* \n Balance after withdrawal: " + amt+"\n_______________________________");  
            } else {  
                System.out.println("Your Balance is less than " + amt + "\tTransaction failed...!!" );  
            }  
    }
  
}