/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package bankingapplication2;

import bankinglogic.Banks;
import bankinglogic.CitiBank;
import bankinglogic.UOB;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class BankingApplication2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    //int myint = Integer.parseInt("A");
         
            
             
    UOB firstUOBCustomer = new UOB(); //object reference available
    Transactions(firstUOBCustomer,1000,
              "Eva Longoria", 
              "Savings Account", 10000, 500);
   
  
    UOB secondUOBCustomer = new UOB(); //object reference available
    Transactions(secondUOBCustomer,2000,
              "Michael Shepard", 
              "Gold Account", 10000, 500);
    
//    UOB thirdUOBCustomer = new UOB(1);
//    UOB fourthUOBCustomer = new UOB(); 
    
    Banks fifthUOBCustomer = new UOB();
    
    //CitiBank Transactions
     CitiBank firstCTCustomer = new CitiBank(); //object reference available
     Transactions(firstCTCustomer,4000,
              "Michael Keaton", 
              "Savings Account", 20000, 100);
    
    
    ArrayList BankCustomers= new ArrayList(); 
    BankCustomers.add(firstUOBCustomer);
    BankCustomers.add(secondUOBCustomer);  
    BankCustomers.add(firstCTCustomer);  
      
   
    //Summary list of all banking Customers
  Banks citibankc = firstCTCustomer;
   for (Object customer:  BankCustomers)
   {
    
    
        if (((Banks)customer).getAccountType() != 
                "Savings Account")
        {
            continue;
//            System.out.println("Customer found...");
//            break;
        }
         System.out.print(((Banks)customer).getAccountNo()  + "-");
         System.out.println(((Banks)customer).getAccountName() ); 
        }
   }

    private static void Transactions(Banks Customer, 
            int acctNo, String acctName, String acctType,
            double depAmount, double withAmount) {
         Customer.setAccountNo(acctNo);
         Customer.setAccountName(acctName);
        Customer.setAccountType(acctType);
        Customer.deposit(depAmount);
        Customer.withdrawal(withAmount, 3000);
        
        if (Customer instanceof UOB)
            Customer.bankDisclaimer.append(" For UOB...");
        else
        {

            Customer.bankDisclaimer.append(" For CitiBank...");
            ((CitiBank)Customer).ctbankPromotion();
        }
        Customer.displayTransaction();
        System.out.println(Banks.bankPolicy());
        
    }
    
     
   
    }
    
