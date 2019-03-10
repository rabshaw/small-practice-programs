package palindromechecker;

/**
 * Java program which checks if a user input string is a palindrome
 * @author Robert Shaw
 */

//import Scanner class from Java utilities library
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        
        // declare strings a and b to hold user input string and control string
        String a, b = "";
        // declare new scanner to accept user input
        Scanner in = new Scanner(System.in);
        // request user input
        System.out.println("Enter a string to see if it's a palindrome...");
        // assign user input to String variable 'a'
        a = in.nextLine();
        // declare int 'ind' in order to traverse user string
        int ind = a.length();
        
        // implement for and if else loops to reverse the entered word
        // and check if the reversed word matches the original
        // user input string
        for (int i = ind - 1; i >= 0; i--){
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)){
            System.out.println("Congratulations! Your word is a palindrome... woo-hoo...");
        } else {
            System.out.println("Your word is not a palindrome... retreat in shame!");
          }
    }
    
}
