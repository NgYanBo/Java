/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinglogic;

/**
 *
 * @author Student
 */
public class Banks{ // super class, base class
    private int accountNo = 1000;
    private String accountName = "";
    private String accountType = "";
    private double accountBalance = 0.0;
    private boolean accountActive = true;
    public final int CLOSING_MONTHS;
    public StringBuilder bankDisclaimer = new StringBuilder("Disclaimer....");
    public String [] bankBranches = {"North", "South", "East"};
    
    
    
    public Banks()
    {
       CLOSING_MONTHS = 12;   
    }
    
    public Banks(int month)
    {
       CLOSING_MONTHS = month;   
    }
    
    public void deposit(double depositAmount)
    {
//        double interestRate = 0.10;
//       accountBalance += (depositAmount + (depositAmount * interestRate));
       accountBalance += depositAmount;
    }
    
    public void withdrawal(double withdrawalAmount,
            double withdrawalLimit)
    {
        

           
         //Chaining IF
        if (withdrawalAmount >= withdrawalLimit && getAccountType() == "Savings Account")
             System.out.println("You went beyond the limit...");  
        else if (withdrawalAmount <=0)
                System.out.println("Amount can't be <= 0");  
            else 
                accountBalance -= withdrawalAmount;
            
    }
    
    public void displayTransaction(){
        System.out.println("Account No:" + getAccountNo());
        System.out.println("Account Name:" + getAccountName());
        System.out.println("Account Type:" + getAccountType());
        System.out.println("New Account Balance:" + getAccountBalance());
        System.out.println("Bank Disclaimer:" + bankDisclaimer);
        String discInCaps = bankDisclaimer.toString();
        System.out.println(discInCaps.toUpperCase());
        cmInWord();
        System.out.println("Bank Branches:");
        System.out.println(bankBranches[0]);
        System.out.println(bankBranches[1]);
        System.out.println(bankBranches[2]);
        System.out.println();
    }
    
    
    public void cmInWord()
    {
        int month = CLOSING_MONTHS;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println("Closing Month:" + monthString);
    }
    
   public static String bankPolicy()
   {
       return "No deposit less than 1000...";
   }

    /**
     * @return the accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        if (accountType == "Savings Account" 
                || accountType == "Deposit Account")
              this.accountType = accountType;
        else 
        {
            System.out.println("Invalid Account Type...");
            this.accountType = "Invalid Account";
        }
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @return the accountActive
     */
    public boolean isAccountActive() {
        return accountActive;
    }

    /**
     * @param accountActive the accountActive to set
     */
    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }
}
