/* SavingsAccount class
   Anderson, Franceschi
*/

import java.text.NumberFormat;

// 1. ***** indicate that SavingsAccount inherits
//          from BankAccount

public class SavingsAccount extends BankAccount
{
   public final double DEFAULT_RATE = .03;
   // 2. ****** define the private interestRate instance variable
   // interestRate, a double, represents an annual rate
  
   //START
   private double interestRate;
   //END

   // 3 ***** write the default constructor
   /** default constructor
   *   explicitly calls the BankAccount default constructor
   *   set interestRate to default value DEFAULT_RATE
   *   print a message to System.out indicating that
   *    constructor is called
   */
   
   //START
   public SavingsAccount(){
	   super();
	   interestRate = DEFAULT_RATE;
	   System.out.println("BankAccount default constructor is called.");
   }
   //END

   // 4 ***** write the overloaded constructor
   /** overloaded constructor
   *   explicitly call BankAccount overloaded constructor
   *   call setInterestRate method, passing startInterestRate
   *   print a message to System.out indicating that
   *    constructor is called
   *  @param  startBalance      starting balance
   *  @param  startInterestRate starting interest rate
   */
   
   //START
   public SavingsAccount(double startBalance, double startInterestRate){
	   super( startBalance );
	   setInterestRate( startInterestRate );
	   System.out.println("BankAccount overloaded constructor is called");
   }
   //END


   // 5 ****** write this method:
   /** applyInterest method, no parameters, void return value
   *  call deposit method, passing a month's worth of interest
   *  remember that interestRate instance variable is annual rate
   */
   
   //START
   public void applyInterest(){
	   deposit(interestRate/12);
   }
   //END


   /** accessor method for interestRate
   *  @return  interestRate
   */
   public double getInterestRate( )
   {
     return interestRate;
   }

   /** mutator method for interestRate
   *  @param  newInterestRate new value for interestRate
   *          newInterestRate must be >= 0.0
   *            if not, print an error message
   */
   public void setInterestRate( double newInterestRate )
   {
     if ( newInterestRate >= 0.0 )
        interestRate = newInterestRate;
     else
        System.err.println( "Interest rate cannot be negative" );
   }

   // 6 *****  write this method
   /* toString method
   *  @return String containing formatted balance and interestRate
   *    invokes superclass toString to format balance
   *    formats interestRate as percent using a NumberFormat object
   *    To create a NumberFormat object for formatting percentages
   *    use the getPercentInstance method in the NumberFormat class,
   *    which has this API:
   *       static NumberFormat getPercentInstance( )
   */
   
   //START
   public String toString(){
	   return super.toString()+"; interest rate is " + MONEY.format(interestRate);
   }
   //END

}
