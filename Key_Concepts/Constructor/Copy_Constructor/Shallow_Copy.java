/*--------------------------------------------------------------------------------------------------------------------------
Shallow Copy
-Changes reflects
----------------------------------------------------------------------------------------------------------------------------*/

public class Shallow_Copy{
     public static void main(String args[]){
        Student s1=new Student();
        s1.name="priya";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1); //s1 ki sab property s1 ke andar copy ho jaye
        s2.password="xyz";

        for(int i=0; i<3; i++){
            System.out.print(s2.marks[i]+" ");
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }

    Student(Student s1){ //shallow Copy
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
}   
