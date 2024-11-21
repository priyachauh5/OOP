
/*--------------------------------------------------------------------------------------------------------------------------
Hybrid inheritance
-Hybrid inheritance in Java is a combination of two or more types of inheritance.
----------------------------------------------------------------------------------------------------------------------------*/

// Hybrid inheritance
import java.util.*;
public class Hybrid{
    public static void main(String args[]){
        Mammal mam =new Mammal();
        mam.Mammal();
    }
}

class Animal{
    void walk(){
        System.out.print("Animals can walk");
    }
    void swim(){
        System.out.print("Animals can swim");
    }
}
class Fish extends Animal{
    void Fish(){
        System.out.print("Fish extends Animal");
    }
     
}
class Bird extends Animal{
     void Bird(){
        System.out.print("Bird extends Animall");
    }
}
class Mammal extends Animal{
     void Mammal(){
        System.out.print("Mammal extends Animal");
    }
}
class Tuna extends Fish{
    void Tuna(){
        System.out.print("Tuna extends Fish");
    }
}
class shark extends Fish{
     void shark(){
        System.out.print("shark extends Fish");
    }
}
class Peacock extends Bird{
     void Peacock(){
        System.out.print("Peacock extends Birds");
    }
}
class Dog extends Mammal{
     void Dog(){
        System.out.print("Dog extends Mamma");
    }
}
class Cat extends Mammal{
     void Cat(){
        System.out.print("Cat extends Mammal");
    }
}
class Human extends Mammal{
     void Human(){
        System.out.print("Human extends Mammal");
    }
}

