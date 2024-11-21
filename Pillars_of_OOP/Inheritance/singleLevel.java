
/*--------------------------------------------------------------------------------------------------------------------------
Single-Level Inheritance
- There is only one base class and one derived class
----------------------------------------------------------------------------------------------------------------------------*/

public class singleLevel{
    public static void main(String args[]){
        Mammal ani=new Mammal();
        ani.walk();
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
class Mammal extends Animal{
    int leg;
    void walk(){
        System.out.print("Walks");
    }
}