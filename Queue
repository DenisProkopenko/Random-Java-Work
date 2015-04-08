/*
Denis Prokopenko

This program creates a default queue with default size, and or creates a queue
with a given size. Then incert or delete values

This program also gives error messages when trying to delete a value from an
empty queue or add values to a full queue
 */
package test.queue;

public class TestQueue {
    public static void main(String[] args){
        Queue q1 = new Queue();
        System.out.println("Deleted Value: "+q1.qDelete());
        
        Queue q2 = new Queue(4);
        q2.qInsert(1);
        q2.qInsert(3);
        System.out.println("Deleted Value: "+q2.qDelete());
        q2.qInsert(5);
        q2.qInsert(7);
        System.out.println("Deleted Value: "+q2.qDelete());
        q2.qInsert(9);
        q2.qInsert(5);
        q2.qInsert(5);
        System.out.println("Deleted Value: "+q2.qDelete());
        System.out.println("Deleted Value: "+q2.qDelete());
        System.out.println("Deleted Value: "+q2.qDelete());
        System.out.println("Deleted Value: "+q2.qDelete());
        System.out.println("Deleted Value: "+q2.qDelete());
        
                                            }// end main()
                        }// end TestQueue class
//Class Queue 
class Queue {
    //variables
    private int[] elements;
    private int front = 0;
    private int rear = 0;
    private int size;
    public static final int DEFAULT_CAPACITY = 3;
    
    //default Queue constructor
    public Queue (){
        size = DEFAULT_CAPACITY + 1;
        elements = new int[size];
                    }//end default Queue()
    
    //Queue constructor
     public Queue (int capacity){
        size = capacity + 1;
        elements = new int[size];
                                 }//end Queue constructor
     
    //Moves front to show that first incerted element is no longer there
    public int qDelete(){
        int value = 0;
        
        if (qEmpty()){
            System.out.printf("Cannot Delete... Queue is EMPTY\n");
            value = -1;
                      }
        else{
            value = elements[front];
            front = (front + 1) % size;
            }
        
        return value;
                        }//end qDelete()
    
    //Checks if queue is full, if not then insert the new element into queue
    public void qInsert(int value){
        if (qFull()){
            System.out.printf("Cannot Insert... Queue is FULL\n");
                    }
        else{
            elements[rear] = value;
            rear = (rear + 1) % size;
            }
                                   }//end qIncert()
    
    //
    //Check if queue is fullreturn true if it is, else return false
    public boolean qFull(){
        if (front == (rear+1) % size){
            return true;
                                     }
        else{
            return false;
            }
                          }//end full()
    
    //check if que is empty, return true if it is, else return false
    public boolean qEmpty(){
        if (front == rear){
            return true;
                          }
        else{
            return false;
            }
                           }// end empty()
             }//end class Q

/*
Cannot Delete... Queue is EMPTY
Deleted Value: -1

Deleted Value: 1
Deleted Value: 3
Cannot Insert... Queue is FULL
Deleted Value: 5
Deleted Value: 7
Deleted Value: 9
Deleted Value: 5
Cannot Delete... Queue is EMPTY
Deleted Value: -1
*/
