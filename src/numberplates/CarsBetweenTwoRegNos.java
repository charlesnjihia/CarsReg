/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberplates;
import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author charles
 */
public class CarsBetweenTwoRegNos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* declare scanner to get the user input via keyboard */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Reg Number ");
        /*input first regstration number */
        String firstReg=scan.nextLine();
        System.out.println("Enter the second Reg Number ");
        /* input secons registration number */
        String secondReg=scan.nextLine();
        
        /* call the function to return the cars between the two registration numbers */
        int carsBetween=getCarsBetween(firstReg,secondReg);
        
        /* oputput the  returned value */
       System.out.println("Cars between the two Reg. Numbers is "+carsBetween);  
        
    }
    
    private static int getCarsBetween(String firstReg,String secondReg){
       
        /* for each of the registration numbers get the car purchase number */
        int firstCarPurchaseNumber=getCarsIntNumber(firstReg);
        int secondCarPurchaseNumber=getCarsIntNumber(secondReg);
        
         /* return the absolute defference between the two purchase numbers as the input of reg numbers does not  have to necessarily start with newer  one followed by the older one */
        /*  subtract 1 to get cars between */ 
        int carsInBetween=(abs(firstCarPurchaseNumber-secondCarPurchaseNumber))-1;
        
       
          
        
     return carsInBetween;   
    }
    
    private static int getCarsIntNumber(String regNo){
     /* make character A the base for our calculations as all registration start from A */
     char baseChar='A';
     /* get the integer value for character A */
     int baseAsciiValue=(int)baseChar;
     
     /* get integer values for the character values at index 2,3, and 7(last) */
     char secondLetter=regNo.charAt(1);
     int ascciSecondLetter=(int)secondLetter;
     char thirdLetter=regNo.charAt(2);
     int ascciThirdLetter=(int)thirdLetter;
     char lastLetter=regNo.charAt(7);
     int ascciLastLetter=(int)lastLetter;
     
     /* get the interger values for the integer substring of the reg. number */
     String intString=regNo.substring(4,7);
     int stringInteger=Integer.parseInt(intString);
     
     /* with the obtained values get the purchase number for the car */
     int carPurchaseNumber=((ascciSecondLetter-baseAsciiValue)*999*26*26)+((ascciThirdLetter-baseAsciiValue)*999*26)+((ascciLastLetter-baseAsciiValue)*999)+stringInteger;
     
     return carPurchaseNumber;
    }
    
}
