/*--------------------------------------------------------------------------------------------------------------------------
Parameterized Constructor
-Parameter is passed to constructor
----------------------------------------------------------------------------------------------------------------------------*/

public class parameterized{
     public static void main(String args[]){
        Student s1=new Student("priya");
        Student s2=new Student(123);
    }
}
class Student{
    String name;
    int roll; 
    String password;
    int marks[];
    Student(String name){ //Parameter is passed to the constructor
        marks=new int[3];
        this.name=name;
        System.out.println("My name is Priya Chauhan");
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
        System.out.println("My roll no is 37");
    }
}   
