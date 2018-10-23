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
public class UOB extends Banks{
    
    public UOB()
    {
       super();  //Banks()
    }
    
    public UOB(int month)
    {
       super(month);
    }
     
    @Override
    public void deposit(double depositAmount)
    {
        double interestRate = 0.10;
        super.deposit(depositAmount +
                (depositAmount * interestRate));
      System.out.println("Bonus added...");
       
    }
}


    
    

    
