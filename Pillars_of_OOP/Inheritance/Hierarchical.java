
/*--------------------------------------------------------------------------------------------------------------------------
Hierarchical inheritance
- There is one base class and multiple derived class
----------------------------------------------------------------------------------------------------------------------------*/

public class Hierarchical{
    public static void main(String args[]){
        Fish fish=new Fish();
        fish.swim();
    }
   
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.print("eats");
    }
    void brteathe(){
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water"); //contains properties and functions
    }
}

class Mammal extends Animal{
    int leg;
    void walk(){
        System.out.print("Walks");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.print("fly");
    }
}