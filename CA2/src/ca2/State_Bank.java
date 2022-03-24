// Unique ID : E7321008
package ca2;
import ca20.*;
import java.util.*;
class MyException1 extends Exception {
    public MyException1(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}



class Acct_Details{  
  public String name;
 public int interest_rate,acct_num,acct_num1,interest;
  int pin;
  int penalty=0;
  List <Integer> l1 =new ArrayList <Integer>(); //Account Num
  List <Integer>l2 =new  ArrayList <Integer>(); // Pin
  //String[] array = {"Regular Account","Interest Account","Checking Account","CD Account"};// Deposit Amt
  //Converting Array to List  
  public List<String> l3=new ArrayList<String>();
   
   
  
  //Acct_Details acct=new Acct_Details();
  Scanner sc= new Scanner(System.in);
  void details() {
    System.out.println("Enter your name : ");
    name=sc.next();
    System.out.println("Enter Account Number : ");
    acct_num=sc.nextInt();
    l1.add(acct_num); // Adding acct num in list
    System.out.println("Create your PIN : ");
    pin=sc.nextInt();
    l2.add(pin);
    l3.add("Regular Account");
    l3.add("Interest Account");
    l3.add("Checking Account");
    l3.add("CD Account");
    
    
  }
  void regular_acct() {
    details();
    System.out.println("--Regular Account Created--");
      
    
  }
  void interest_acct() {
    
    
    details();
    System.out.println("--Interest Account Created--");
    
  }
  void checking_acct() {
    details();
    System.out.println("--Checking Account Created--");
    
  }
  void cd_acct() {
    details();
    System.out.println("--CD Account Created--");

  }
  
  public void display() {
    System.out.println("\n*****  ACCOUNTS LIST ********");
    System.out.println("Name : "+name);
    System.out.println("Account Number : "+acct_num);
    //System.out.println("Balance : "+t.amt);
    
  }
  
}
public class State_Bank extends Acct_Details {
public static void main (String [] args) {
  int ch;
  Scanner sc = new Scanner(System.in);
  Acct_Details ac=new Acct_Details();
  Transfer t=new Transfer();
  System.out.println("Unique ID : E7321008\n "+"\n------------STATE BANK OF INDIA---------------- \n");
  while(true){
  System.out.println("Enter your Choice  1 or 2: \n 1.For Creating an Account \n 2.For Acccessing the Account ");
  int rr=sc.nextInt();
  if(rr == 1) {
    System.out.println("Choose the Type of Account to be created\n");
    System.out.println("1.Regular Account\n2.Interest Account\n3.Checking Account\n4.CD Account\n");
    System.out.println("Enter your Choice : ");
    ch=sc.nextInt();
    switch(ch) {
    case 1:
      if (ch==1) {
        ac.regular_acct();
        break;
      }
    case 2:
      if (ch==2) {
        ac.interest_acct();
        break;
      }
      
    case 3:
      if (ch==3) {
        ac.checking_acct();
        break;
      }
    case 4:
      if (ch==4) {
        ac.regular_acct();
        break;
      }
    }
    ac.display();
    System.out.println("Account Type: "+ac.l3.get(ch-1));
    System.out.println("Balance: "+t.amt+"\n-------------------------------------\n");
    //for(int i : ac.l1 ) {
      //System.out.println("\n account number list: "+i);
        //}
  
  }// if
  
  if(rr == 2) {
    //transfer block
    Scanner sc1= new Scanner(System.in);
    System.out.println("Enter the Account Number: ");
    int n1 = sc1.nextInt();
    for(int i : ac.l1) {
      if(i==n1) {
        System.out.println("Enter the Pin: ");
        int n2 = sc1.nextInt();
        int j=ac.l1.indexOf(i);
        int k =ac.l2.get(j);
        try {
          if(k!=n2) {
            throw new MyException1(" Wrong Pin ");
        }
          else {
            System.out.println("Sucess");
            ac.display();
            System.out.println("Balance: "+t.amt);
            System.out.println("_______________________________\n1. Deposit\n2. Withdraw \n Enter Your Choice : ");
            int e1=sc.nextInt();
            t.dw(e1);
            
          }
        }
        catch(MyException1 ex) {
          
          System.out.println(ex.getMessage());
          break;
        
        }
        
        
      }
    
    
  }
  if(rr == 0) {
    break;
  }
  }//while
  // ac.display();
 // System.out.println("Balance: "+t.amt);
  for(int i : ac.l1) {
    int j=ac.l1.indexOf(i);
    int k =ac.l2.get(j);
    //System.out.println("\nAccount Number : "+i+"\nPin : "+k);
  }
}//main
}}//class