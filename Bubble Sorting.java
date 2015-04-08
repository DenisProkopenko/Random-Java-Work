/*
Denis Prokopenko
 */
package sorting;
public class Sorting
{
    public static void main(String[] args)
    {
        long tStart;
        long tEnd;
        
        int[] list1 = new int[10];
        Accending(1,list1);
        print(list1);
        tStart = System.currentTimeMillis();//time start
        BubbleSort(list1);
        tEnd = System.currentTimeMillis();//time end
        print(list1);
        System.out.println("Array of 10 Accending "+
                (tEnd-tStart)+" Milli Seconds");
        
        int[] list2 = new int[10];
        Decending(10,list2);
        print(list2);
        tStart = System.currentTimeMillis();//time start
        BubbleSort(list2);
        tEnd = System.currentTimeMillis();//time end
        print(list2);
        System.out.println("Array of 10 Decending "+
                (tEnd-tStart)+"  MilliSeconds");
        
        int[] list3 = new int[10];
        Randomized(1,10,list3);
        print(list3);
        tStart = System.currentTimeMillis();//time start 
        BubbleSort(list3);
        tEnd = System.currentTimeMillis();//time end
        print(list3);
        System.out.println("Array of 10 Randomized "+
                (tEnd-tStart)+" Milli Seconds");
        
        int[] list4 = new int[50000];
        Accending(1,list4);
        tStart = System.currentTimeMillis();//time start
        BubbleSort(list4);
        tEnd = System.currentTimeMillis();//time end
        System.out.println("Array of 50000 Accending "+
                (tEnd-tStart)+" Milli Seconds");
        
        int[] list5 = new int[50000];
        Decending(50000,list5);
        tStart = System.currentTimeMillis();//time start
        BubbleSort(list5);
        tEnd = System.currentTimeMillis();//time end
        System.out.println("Array of 50000 Decending "+
                (tEnd-tStart)+" Milli Seconds");
        
        int[] list6 = new int[50000];
        Randomized(1,50000,list6);
        tStart = System.currentTimeMillis();//time start
        BubbleSort(list6);
        tEnd = System.currentTimeMillis();//time end
        System.out.println("Array of 50000 Randomized "+
                (tEnd-tStart)+" Milli Seconds");
        
    }//end main
    
    //fill in the array with numbers Accending
    public static int[] Accending(int start,int[] list)
    {
        for (int i = 0 ; i < list.length ; i++)
        {
            list[i] = start;
            start += 1;
        }//end for loop
        return list;
    }//end Accending()
    
    //fill in the array with numbers Decending
    public static int[] Decending(int start,int[] list)
    {
        for (int i = 0 ; i < list.length ; i++)
        {
            list[i] = start;
            start -= 1;            
        }//end for loop
        return list;
    }//end Decending()
    
    //fill in the array with Randomized numbers
    public static int[] Randomized(int min, int max, int[] list)
    {
        for (int i = 0 ; i < list.length ; i++)
        {
            int randomNum = min + (int)(Math.random()*max);
            list[i] = randomNum;
        }//end for loop
        return list;
    }//end Randomized()
    
    //sort the array in Accending with Bubble Sorting
    public static void BubbleSort(int[] list)
    {
        boolean sorted = false;
        int pass = 1;
        int n;
        int temp;

        n = list.length;
        while ((sorted == false) && (pass < n))
        {
            sorted = true;
            for (int i = 0 ; i <= n - pass - 1 ; i++)
            {
                if (list[i] > list[i + 1])
                {
                    temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                    sorted = false;
                }//end if
            }//end for loop
            pass += 1;
         }//end while
    }//end BubbleSort
    
    public static void print(int[] list)
    {
        for(int i=0; i<list.length; i++)
            {
            System.out.print(list[i] + " ");
            }//end for loop
        System.out.println();
    }//end print function
}//end Sorting Class

/*
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
Array of 10 Accending 0 Milli Seconds
10 9 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 9 10 
Array of 10 Decending 0  MilliSeconds
1 7 2 2 10 6 5 2 2 3 
1 2 2 2 2 3 5 6 7 10 
Array of 10 Randomized 0 Milli Seconds
Array of 50000 Accending 0 Milli Seconds
Array of 50000 Decending 4900 Milli Seconds
Array of 50000 Randomized 7880 Milli Seconds
*/
