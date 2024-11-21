
/*--------------------------------------------------------------------------------------------------------------------------
Super Keyword
It is used to refer/acccess immediate parents class
-to access parents property
-to access parents functions
-to access parents constructor
----------------------------------------------------------------------------------------------------------------------------*/

public class Super{
    public static void main(String args[]){
        Horse h=new Horse();
        System.out.print(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super(); //immediately call parents class
        super.color="brown";
        System.out.println("Horse constructor is called");
    }
}