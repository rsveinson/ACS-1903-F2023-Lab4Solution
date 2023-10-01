/**
 * ACS-1903 Lab 4 Question 7
 * @author Sveinson
 */
import java.util.Scanner;

public class LongWordCountKey{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int count = 0;
        String strin;
        
        System.out.println("Enter some words (stop to end)");
   
        // enter your code here
        strin = kb.next();
        
        while(!strin.equalsIgnoreCase("stop")){
            if(strin.length() > 5){
                count++;
            }// end if
            
            strin = kb.next();
        }// while
        
        System.out.println("Number of long words: " + count);
    }
}
