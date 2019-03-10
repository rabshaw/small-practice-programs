package reverseastring;

/**
 * Short java class which reverses any string entered by the end user.
 * @author Robert Shaw
 */

//import Scanner class from Java utilities library
import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        // request user input
        System.out.println("Enter a string and see it in reverse!");
        
        // declare new Scanner named userIn
        Scanner userIn = new Scanner(System.in);
        // declare new string to accept user input
        String str = userIn.nextLine();
        // declare empty string named reverse to display reversed user string
        String reverse = "";
        
        // for loop which retrieves the characters of the original string
        // beginning at the end of the user input string before concatenating
        // to create a new string of characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        
        // print reversed string display message to user
        System.out.println("Your string reversed: ");
        // print reversed string after display message
        System.out.println(reverse);
    }
    
}
