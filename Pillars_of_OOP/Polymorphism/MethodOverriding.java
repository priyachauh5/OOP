/*--------------------------------------------------------------------------------------------------------------------------
Method Overriding
Parent and class both contains same function with different definition
----------------------------------------------------------------------------------------------------------------------------*/

//Method overriding at run time
public class MethodOverriding{
    public static void main(String args[]){
        Cat cat=new Cat();
        cat.eat();
    }
}
class Animal{
    void eat(){
        System.out.print("Eat anything");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.print("eats grass");
    }
}