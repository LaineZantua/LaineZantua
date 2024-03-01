package PackageFeb27;

import java.util.Scanner;

public class Employee extends Hr{
    
     public void display(){
           System.out.println("Employee Ni");
       }
     public void addEmployee(){
           Scanner scn = new Scanner(System.in);
           
           System.out.println("Enter First Name: ");
           String fName = scn.nextLine();
           
           System.out.println("Enter Middle Name: ");
           String mName = scn.nextLine();
           
           System.out.println("Enter Last Name: ");
           String lName = scn.nextLine();
           
           System.out.println("Position: ");  
           String Position = scn.nextLine();
           
           System.out.println("Age: ");
           int Age = scn.nextInt();
     }
}
