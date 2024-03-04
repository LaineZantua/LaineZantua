
package JavaActivity25;

import java.util.ArrayList;
import java.util.Arrays;


public class TwoD {
    
    public static void main (String [] args) {
        
//        int [] oneDArray = {55, 5, 1, 3};
//        int [][] twoDArray = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9},
//        };
//        int xRow = 1;
//        int yColumn = 2;
//        
//        System.out.println("Your Array is: " + twoDArray[xRow][yColumn]);
//        System.out.println("Your 1d Array is: " + oneDArray [0]);

        int [] numericArray = {100, 150, 200, 250, 500, 1000};
        int [] stringnumericArray = new int[]  {100, 150, 200, 250, 500, 1000};
        
        String[] stringArray = new String[] {"Ako", "akorani", "akogihapon"};
        
        
        ArrayList arraylist = new ArrayList(Arrays.asList(numericArray));
        
        System.out.println("My Array list is: " + arraylist);
//        
//        String[] stringArray = {"Dm", "Rhodz", "Erich", "Elsa", "Maria", "Regie"};
//        
//                
//        System.out.println("Your original Array is :" + "  " +  Arrays.toString
//        (numericArray) + "\n" +Arrays.toString(stringArray)); 
//        
//        Arrays.sort(numericArray);
//        System.out.println("Your sorted Array is: " + "  " +  Arrays.toString
//        (numericArray));
//        
//         Arrays.sort(stringArray);
//        System.out.println("Your sorted Array is: " + "  " +  Arrays.toString
//        (stringArray));
    }
}
