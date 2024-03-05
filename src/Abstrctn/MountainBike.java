package Abstrctn;

//i override sa motorbike
//public class MountainBike extends MotorBike {
//
//    @Override
//    void brake() {
//        System.out.println("MountainBike");
//    }
//
//    @Override
//    void accelerate() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}

public class MountainBike extends MotorBike{

    @Override
    public void brake() {
        System.out.println("Displaying brake");
    }
    
    @Override
    public void display (){
        System.out.println("Displaying...");
    }

    
}
