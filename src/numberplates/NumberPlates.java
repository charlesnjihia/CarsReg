/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberplates;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author charles
 */
public class NumberPlates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* declare scanner to get the user input via keyboard */
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the full sentence ");
         /*input the sentence that contains the reg numbers */
        String inputText=scan.nextLine();
        
         /*call the function getRegNumber that returns the registration number if any */
        String inputRegNo=getRegNumber(inputText);
        
        /* if the length of returned string is greater than 0 output the string alse no reg was input */
        if(inputRegNo.length()>0){
          System.out.println("Entered  Reg number is : "+inputRegNo);   
        }else{
            
          System.out.println("No Reg Number was entered");    
        }
        // TODO code application logic here
    }
    
  static String getRegNumber(String inputString){
      
     /* patter to match a reg. number plate */
     
     /* the first character must be capital K */
     /* the second and third characters should be capital aphabets */ 
     /* the fourth character should be a space */ 
     /* the fifth  and sixth character should decimal values */ 
     /* the seventh  character should decimal values with the exception of 0 */ 
     /* the eigth charactes should be capital aphabet */ 
      
     String regPattern="K[A-Z]{2}\\s\\d{2}[1-9][A-Z]"; 
     String regNo=""; 
     Pattern p=Pattern.compile(regPattern);
     /* find if the pattern is obtained from the passed string */
     Matcher m=p.matcher(inputString);
     
     /* assign to the newly declared string regNo and return the string  */
     if(m.find()){
      regNo=m.group();
     }
     
     return regNo;
     
     
 }   
    
}
