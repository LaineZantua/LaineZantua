
package Prac;
import java.util.Scanner;

public class HrManager extends Employee {
    Scanner scn = new Scanner(System.in);
    
    public int Work_days;
    public String Name;
    public String Your_Work;
    public int Salary;
    
    public void work (){
        System.out.println("Work: ");
        Your_Work = scn.nextLine();
        
    }
    
    public void getSalary(){
        System.out.println("Working days: ");
        Work_days = scn.nextInt();
        
        Salary = Work_days * 10000;
        
    }
    
    public void addEmployee(){
        System.out.println("Name of Employee: ");
        Name = scn.nextLine();
    }
    
    public void Data_of_Employee(){
        System.out.println("Name of Employee: " + Name + "\n" + "Work: " +Your_Work + 
                "\n" + "Salary: Php  " + Salary);
    }
}