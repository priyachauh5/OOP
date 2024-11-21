/*--------------------------------------------------------------------------------------------------------------------------
Abstraction
-Hiding all the unnecessary deatils and showing only important part to user
-Abstract keyword is used
----------------------------------------------------------------------------------------------------------------------------*/


//Abstarction
import java.util.*;
public class OOPs{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color); //sabse pehele parents ka constructor call hoga isliye brown print hoga child k constructor call baad mai hoga

        // Animal a=new Animal(); //we cannot create any intstance or object from abstract;
        Mustang myHorse=new Mustang(); //last wale ko call kiye tho upper ke saare construct apne aap call hojayenge
        //Animal->Horse->Mustang
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
    // Animal(){ //created a constructor
    //     color="brown";
    // }
    void eat(){
        System.out.println("animals can eat");
    }
    abstract void walk(); //abstract method we cant write implementation here
}// hamesha implementation derived class mai likha jayega|| har derived class ke andar exits karna chahiye

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("chicken constructor is called");
    }
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}