/*
Denis Prokopenko
This program contains Class Rectangle and uses that class when building a 
rectangle with given length and width
 */
package main;
public class Main {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(4,40);
        System.out.printf("Area: %.2f\n", r1.getArea());
        System.out.printf("Perimiter: %.2f\n\n", r1.getPerimiter());
        
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.printf("Area: %.2f\n", r2.getArea());
        System.out.printf("Perimiter: %.2f\n", r2.getPerimiter());
                                            }//end main()
                    }//end Main class

class Rectangle {
    //variables
    double length = 1;
    double width = 1;
    
    //default Rectangle constructor
    public Rectangle (){
        length = 1;
        width = 1;
                        }//end default Rectangle()
    //Rectangle constructor
    public Rectangle(double newWidth,double newLength){
        length = newLength;
        width = newWidth;
                        }// end Rectangle()
    
    //takes length and width and returns area
    public double getArea(){
        return length*width;
                            }//end getArea
    
    //get length and width and returns perimiter
    public double getPerimiter(){
        return 2*(length+width);
                                }//end getPerimiter
                }//end class Rectangle

/*
Area: 160.00
Perimiter: 88.00

Area: 125.65
Perimiter: 78.80
*/
