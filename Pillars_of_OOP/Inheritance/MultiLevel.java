
/*--------------------------------------------------------------------------------------------------------------------------
MultiLeve Inheritance
-There is multiple level derived class is derive from the base class
----------------------------------------------------------------------------------------------------------------------------*/

public class MultiLevel{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.weep();
        p.bark();
        p.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}


