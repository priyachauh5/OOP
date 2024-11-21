
/*--------------------------------------------------------------------------------------------------------------------------
Class 
-BluePrint of object.
-It contains Alltribute(Properties) and Function(behaviour) together

Object
-Entity in real world
-created in main function
----------------------------------------------------------------------------------------------------------------------------*/

public class OOPs{
    public static void main(String args[]){
        Student s1=new Student(); //Object is created using new keyword
        s1.schoolName="JMV";

        Student s2=new Student();
        System.out.println(s2.schoolName);

        Student s3=new Student();
        s3.schoolName="ABCD";
    }
}

class Student{   // class is created this is Base class
    static int returnPercentage(int math, int phy, int chem){ 
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolName;
    void setName(String Name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}