/* Denis Prokopenko
 * This program takes 3 hard-codded arrays of different element types
 * and uses their element type to start the required overloading function.
 */

package overloading;
// import arrays to help print them on screen
import java.util.Arrays;
// class
public class Overloading {
    // main
    public static void main(String[] args) {
        // hard-codded arrays
        int[] array1 = {1,2,3};             // int
        double[] array2 = {1.1,1.2,1.3};    // double
        char[] array3 = {'a','b','c'};      // char
       
        // start each array under the same function name and let the compiler
        // chose the correct function to start based off the array element 
        // type
        overload(array1);
        overload(array2);
        overload(array3);
                                            }// end main
    
    // overloading function for an array with int elements
    public static int overload(int array[]){
        // use imported Arrays to print out full array
        System.out.println("Integer Array "+Arrays.toString(array));
        return 0;
                                            }
    // overloading function for an array with double elements
    public static double overload(double array[]){
        // use imported Arrays to print out full array
        System.out.println("Double Array "+Arrays.toString(array));
        return 0;
                                                  }
    // overloading function for an array with char elements
    public static char overload(char array[]){
        // use imported Arrays to print out full array
        System.out.println("Char Array "+Arrays.toString(array));
        return 0;
                                             }
                        }// end class
/*
Integer Array [1, 2, 3]
Double Array [1.1, 1.2, 1.3]
Char Array [a, b, c]
*/
