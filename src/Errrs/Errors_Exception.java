package Errrs;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Errors_Exception extends Abstrct_class{
    public static void main (String[] args){
//        
//        int numOne = 10;  // logical error example
//        int numTwo = 0;
//        
//        int result = numOne / numTwo;
//        
//        System.out.println(result);

//          String name = null; // runtime error example
//          
//          int lenght = name.length();
//          
//          System.out.println(lenght);

// run time error example - code is fine but during the running of code mag error.
//            int[] arr = new int [3];
//            
//            int num = arr [3];

      // Try & catch example:      
//            try {   // this is try na block
//                int numOne = 100;  
//                int numTwo = 10;
//                int result = numOne / numTwo;
//                System.out.println(result);
//                
//        // while this is catch na block        
//            } catch (Exception result){
//                System.out.println(result); // if gusto nimo iprint asa ang mali
//                
//                e.printStackTrace(); // if gusto nimo iprint asa na line ka mali
//            }
            
            try {
                
                Scanner scn = new Scanner(System.in);
                
                String info;
                String Name;
                int age;
                
                System.out.println("Program: ");
                info = scn.nextLine();
                
                System.out.println("Name: ");
                Name = scn.nextLine();
                
                System.out.println("Age: ");
                age = scn.nextInt();
                
                JOptionPane.showConfirmDialog(null,info + "\n" + Name + "\n " 
                        + age);
                 scn.close();
//                String message = "Hello!";
//                String name = "Princess Laine Zantua";
//                String word = "You are ";
//                int age = 19;
//                String wrds = " years old, right?";
//                
//                JOptionPane.showMessageDialog(null, message +"\n" +name + "\n"+
//                        word + age + wrds);
//                JOptionPane.showMessageDialog(null, name);
//                JOptionPane.showMessageDialog(null, age);
                
            } catch (Exception e) {
                System.out.println(e);
            }
    } 
}
