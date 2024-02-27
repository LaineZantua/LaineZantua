package Polymorphism;
//Polymorphism example

//public class ParentAndChild {
  //Compile-time type of Polymorphism  
    class Parent {

        // gamit = attributes
        //tao = function
        public void something () {
            System.out.println("Hi something. ");
        }
            public void Laine(){
                System.out.println("Parent class on void");
            }
    }
    
    
    class Child extends Parent {
        public void something(){
            System.out.println("Hi something ulit");
        }
            public void Laine (){
                System.out.println("Child class extended to Parent");
            }
    }
    
public class ParentAndChild {  
    public static void main(String[] args){
        //object class of ParentAndChild
        ParentAndChild prc = new ParentAndChild(); //declaring object class
//        ParentAndChild.Parent parentClass = prc.new Parent(); 
//        parentClass.something();
        Parent parnt = new Parent(); //parnt = variable name; himo himo lng
        parnt.something();
        parnt.Laine();
        Parent ptn = new Child();
        ptn.something();
        ptn.Laine();
        
    }
}
