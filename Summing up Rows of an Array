/*
Denis Prokopenko

This program creates a 2-dimentional array with 3 rows and 4 columns.
Then has the user fill in the array row by row and returns the array to the main
The program then uses a function that is called by the main and sums up the 
columns of the array.
 */
package assignment.pkg4;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        // create and fill in a 2-dimentional array from another function
        Double[][] matrix = getArray();
        
        int columnIndex = 0;
        
        // loop to print column 0,1,2,3 with sumColumn() function
        // incriment column with each loop
        while (columnIndex < 4){
        System.out.println("Sum of column "+(columnIndex+1)+" is: "+
                sumColumn(matrix,columnIndex));
        columnIndex += 1;
                                }
                                            }//end main
    
    // Creates an array of 3 by 4 and asks user to fill it in row by row
    public static Double[][] getArray() {
        Scanner input = new Scanner(System.in);

        Double[][] matrix = new Double[3][4];
        
        // message asks for user input
        System.out.printf("Enter numbers for a " + matrix.length + " by "+ 
                matrix[0].length + " matrix:\n");
        
        // use 2 loops to fill in the array row by row
        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                    matrix[i][j] = input.nextDouble();
        
        // returns the filled matrix to the main
        return matrix;
                                        }//end getArray

    /*
    Function to sum up the values in the same row
    passed to it are: the 2-dimentional array and the column number
    row number is always reset when function is executed
    */
    public static double sumColumn(Double[][] matrix,int columnIndex){
        double total = 0.0;
        
        // loop through each row and find the corresponding value in the
        // passed columnIndex from main
        for (int row = 0 ; row < 3 ; row++){
            total += matrix[row][columnIndex];
                                            }
        return total;
                                                                    }// end 
                                                                    // sumColumn
                        }

/*
Enter numbers for a 3 by 4 matrix:
1.5
2
3
4
5.5
6
7
8
9.5
1
3
1
Sum of column 1 is: 16.5
Sum of column 2 is: 9.0
Sum of column 3 is: 13.0
Sum of column 4 is: 13.0
*/
