/*Denis Prokopenko
 * This program takes the user input of his or her SSN 
 * and tests it if it is valid, if not, then display the
 * error message and exit.
 */

package social.security;
// import the scanner
import java.util.Scanner;
// public class
public class SocialSecurity {
    // main
    public static void main(String[] args) {
        // create the scanner (input)
	Scanner input = new Scanner(System.in);
		
	// print the instructions on the console
	System.out.print("Enter your Social Security Number in a form of: "
                + "123-12-1234 \n");
		
	// asks for input string and stores it in socialSecurity
	String socialSecurity = input.next();

	// end the input
	input.close();
		
	// find length of the inputed SSN
	int length = socialSecurity.length();
	int index = 0;
	// First check if SSN is in the required length
	if (length < 11 || length > 11){
                System.out.print("Invalid Social Security number, it is too "
                        + "it is either too long, or too short\n");
                System.exit(1);
                                        }
		/* If length test is passed, then start the loop
		 * to check for individual characters
		 */
		else{
                    while(index <= 10){
                        // character variable = to character of the string at the 
                        // index X
                    char character = socialSecurity.charAt(index);
                    
                    // Check for character if its a digit
                    if (Character.isDigit(character)==true){
                        index+=1;
                                                            }
                    // If its not a digit, then check if the character is at
                    // a specific index and if its a required dash '-' at 
                    // that point
                    else if((index == 3 && character == '-') || (index == 6 && 
                            character == '-') ){
                        index += 1;
                            } 
                    else {
                        System.out.print("Invalid Social Security, "
                                + "character "+character+" is an invalid "
                                + "character\n");
                        System.out.print("Please folow this format: "
                                + "123-12-1234");
                        System.exit(1);
                    }
                                        }//end while loop
                    }
		System.out.print(socialSecurity+" Is a Valid Social Security "
                        + "number\n");
                                            }
                            }
/*  Enter your Social Security Number in a form of: 123-12-1234 
    123-12-1234
    123-12-1234 Is a Valid Social Security number

    Enter your Social Security Number in a form of: 123-12-1234 
    123-12*1234
    Invalid Social Security, character * is an invalid character
    Please folow this format: 123-12-1234

    Enter your Social Security Number in a form of: 123-12-1234 
    123-ab-1234
    Invalid Social Security, character a is an invalid character
    Please folow this format: 123-12-1234
*/
