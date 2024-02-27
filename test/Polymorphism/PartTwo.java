
package Polymorphism;


public class PartTwo {
    
    class Parent {
        void dog(){
            System.out.println("Dog");
        }
        
    }
    class Child extends Parent {
        
        void cat(){
            System.out.println("I am Cat.");
        }
    }
    class GrandChild extends Parent {
        
    }
    class GreatGrandChild extends Child {
        void dog(){
            System.out.println("From Great grand child ni.");
        }
    }
    public static void main (String[] args){
        PartTwo prc = new PartTwo();
        
        PartTwo.Parent ParentClass = prc.new Parent(); 
        ParentClass.dog();
        
        PartTwo.Child ChildClass = prc.new Child();
        ChildClass.cat();
        
        PartTwo.GreatGrandChild GreatGrandChildClass = prc.new GreatGrandChild();
        GreatGrandChildClass.dog();
    }
}
