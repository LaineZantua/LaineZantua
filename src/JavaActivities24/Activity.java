
package JavaActivities24;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Activity {
    
      public static void main (String [] args) {
    
        Scanner scn = new Scanner(System.in);
        
            System.out.println("Enter any word: " );
            String word = scn.nextLine();
                      
            System.out.println("Original word: " +word+" ");
            
            String newWord = new StringBuilder(word).reverse().toString();
            
            System.out.println("New word: " +newWord+" ");
   
    }
}