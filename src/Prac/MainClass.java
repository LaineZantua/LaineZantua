
package Prac;


public class MainClass {
    public static void main (String[] args){
        Employee employee = new Employee();
        Employee hrmngr = new HrManager();
        
        hrmngr.addEmployee();
        hrmngr.work();
        hrmngr.getSalary();
        
        hrmngr.Data_of_Employee();
    }
    
}
