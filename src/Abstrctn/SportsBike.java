package Abstrctn;


//public class SportsBike extends MotorBike{
//
//    @Override
//    void brake() {
//        System.out.println("SportsBike");
//    }
//
//    @Override
//    void accelerate() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}

public class SportsBike extends MotorBike{

    @Override
    public void brake() {
        System.out.println("Displaying brake");
    }
    @Override
    public void display (){
        System.out.println("Displaying...");
    }
  
    
}
