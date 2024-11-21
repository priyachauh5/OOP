/*--------------------------------------------------------------------------------------------------------------------------
Non-Parameterized Constructor
-No Parameter is passed to constructor
----------------------------------------------------------------------------------------------------------------------------*/

public class nonParameterized{
     public static void main(String args[]){
        Student s1=new Student(); //directly constructor is called while object creation
    }
}
class Student{
    Student(){ //A constructor with no parameter
        System.out.println("Constructor is called");
    }
}   
