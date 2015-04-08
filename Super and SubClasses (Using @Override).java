/*
Denis Prokopenko

This program creates a super class with an extended subclass.
This program then prints out the data from the two classes with an override 
method within the subclass
 */
package classes;

public class Classes {
    public static void main(String[] args) {
        Student s1 = new Student("Mike",0001,3.0);
        Student s2 = new Student("Jimmy",0003,3.5);
        
        GradStudent gs1 = new GradStudent("Moe",0002,3.1,"CSCI","Loops");
        GradStudent gs2 = new GradStudent("Jeff",0004,3.7,"Math","Classes");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(gs1);
        System.out.println(gs2);
    }
}

class Student{
    //private data feilds
    private String studentName;
    private int studentID;
    private double gpa; 
    
    //constructor
    public Student (String name, int id, double GPA){
        studentName = name;
        studentID = id;
        gpa = GPA;
                                                    }//end construtor
    //create a return statement
    public String toString(){
        return "Student Name: "+studentName+" Student ID: "+studentID
                + " GPA: "+gpa;
                            }
             }//end Student

class GradStudent extends Student{
    //private data feilds
    private String departmentName;
    private String thesisTopic;
    
    //constructor
    public GradStudent(String name, int id, double GPA, String dName, String 
            thesis){
        super(name,id,GPA);//override
        departmentName = dName;
        thesisTopic = thesis;
                                                    }//end constructor
    //create a return statement
    @Override
    public String toString(){
        System.out.println("\n");

        System.out.println(super.toString());
        
        return "Department Name: "+
                departmentName+" Thesis Topic :"+thesisTopic;
                            }
                                }//end GradStudent

/*
Student Name: Mike Student ID: 1 GPA: 3.0
Student Name: Jimmy Student ID: 3 GPA: 3.5

Student Name: Moe Student ID: 2 GPA: 3.1 Department Name: CSCI Thesis Topic 
:Loops

Student Name: Jeff Student ID: 4 GPA: 3.7 Department Name: Math Thesis Topic 
:Classes
*/
