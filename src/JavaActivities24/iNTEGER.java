
package JavaActivities24;

import java.awt.BorderLayout;

public class iNTEGER {
    
//    
     public static void main (String [] args){
//         
//         int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    
//         System.out.println("Arrays Elements: "+arrays[0]);
//         
//         int arrays_sum = arrays[0] + arrays [2] + arrays [4] +  arrays [5];
//         
//         System.out.println("sum of all arrays: " + arrays_sum);

        //Find the maximum value of array
//        
//            int[] array = {955, 356, 150, 499, 700, 350};
//            
//            int max = Math.max(array[1], array[0]); 
//            int max1 = Math.max(array[1], array[5]);
//            int max2 = Math.max(array[4], Math.max(array[1],
//                    Math.max(array[2], Math.max(array[2],
//                            array[1]))));
//            
//            System.out.println("Maximum Value: " + max2);
//            System.out.println("Maximum Value: " + max);
//            System.out.println("Maximum Value; " + max1);

        //Find the minimum value of array
        
            int[] array = {955, 356, 150, 499, 700, 350};
            
            int min = Math.min(array[1], array[0]); 
            int min1 = Math.min(array[1], array[5]);
            int min2 = Math.min(array[4], Math.max(array[1],
                    Math.max(array[2], Math.max(array[2],
                            array[1]))));
            
            System.out.println("Minimum Value: " + min2);
            System.out.println("Minimum Value: " + min1);
            System.out.println("Minimum Value; " + min);
     }
}

        
       