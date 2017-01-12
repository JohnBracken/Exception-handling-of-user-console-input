/*The following code sample shows exception handling in Java.  In this case,      
the user enters two integers as inputs on the console and they are divided and
the division result is displayed, along with the remainder.  The exceptions
handles the situations where the inputs entered by the user are not integers 
and also the situation where division by zero is attempted.  
These scenarios are not permitted by the code.*/
package exceptionexample;

//Java utilities library needed to run needed methods in this code.
import java.util.*;

//Class definition for Exception testing and handling.  
public class ExceptionExample
{
    //Main method
    public static void main(String[] args) 
    {
        
        /*Check to see if try code block execution is successful.  If not,
        then the code will keep asking the user to enter input until they 
        get it right. */
        boolean success = false;
        
        /*Keep repeating the exception handing code until the user correctly
        inputs two integers as requested.*/
        while(!success)
        {
            
            //Exception code to try.  
            try
            {
                
            //Define the numerator and denominator integers for the division.     
            int numerator;
            int denominator;
            
            //Set up the user input.   
             Scanner scanner = new Scanner(System.in);
         
            //Ask user for an integer numerator.
            System.out.print("Enter an integer numerator: ");
            numerator = scanner.nextInt();
        
            //Ask the user for an integer denominator.
            System.out.print("Enter an integer denominator: ");
            denominator = scanner.nextInt();
            
            //Display the division result and the remainder.
            System.out.println("The division answer is: " + 
                    numerator/denominator);
            System.out.println("And the remainder is: " + 
                    numerator%denominator);
            
            /*Change the boolean success flag to true, since the inputs
            were entered properly by the user by this point.*/
            success = true; 
            
            /*Show the division result as a decimal number.  This is a good
            example of casting from an integer result to a floating point
            number.*/
            System.out.println("The decimal division value is: " + 
                    (float)numerator/denominator);
            
            }
                     
            /*Code to execute if an exception is caught.  In this case, the
            two numbers can't be divided (denominator is a 0) and an exception
            is thrown.*/
            catch(ArithmeticException e) 
            {
                
            System.out.println("Can't divide by zero, try again: " + e);
         
            }
            
            /*Check to make sure that the user actually enters an integer
            and not some other unwanted data type (i.e. string, float etc.).*/
            catch(InputMismatchException f) 
            {
                
            System.out.println("At least one of these is not an integer," + 
                 "try again:" + f);
         
            }
        
            /*This code is executed regardless of whether or not an 
            exception was thrown. */
            finally
            {
        
            System.out.println("Code block completed.");
            
            }
            
        }
        
    }
    
}
