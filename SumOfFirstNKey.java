/**
 * ACS-1903 Lab 4 Question 8
 * @author Sveinson
 */
import java.util.Scanner;

public class SumOfFirstNKey{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n, sum;
        
        // write your code here
        sum = 0;
        
        System.out.println("Enter a number: ");
        n = kb.nextInt();
        
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        
        System.out.println("The sum of first 10 numbers is " + sum);
    }
}
