/*--------------------------------------------------------------------------------------------------------------------------
Deep Copy
-Changes does not reflects
----------------------------------------------------------------------------------------------------------------------------*/

public class copy{
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

    Student(Student s1){ //Deep constructor
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }
    }

    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}   
