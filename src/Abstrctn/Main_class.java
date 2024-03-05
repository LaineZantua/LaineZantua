
package Abstrctn;

//abstract class Main_class extends Abstrct_class{
//    public static void main(String[] args){
//        Abstrct_class abstractionclass = new Abstrct_class(){};
//        
//        abstractionclass.display();
//    }
//}


//Motorbike is the parent class
abstract class Main_class extends MotorBike{
     public static void main(String[] args){
         
//         MotorBike motorbike = new MotorBike() {};//dili jud ma instantitate kay abstract class sya
         SportsBike sportbike = new SportsBike ();
         MountainBike mountainbike = new MountainBike();
         
//         motorbike.brake();
         sportbike.brake();
         mountainbike.brake();
         sportbike.display();
         mountainbike.display();
     }
}