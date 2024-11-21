
/*--------------------------------------------------------------------------------------------------------------------------
this keyword
-It is used to refer the current object to find object reference
----------------------------------------------------------------------------------------------------------------------------*/

public class OOPs{
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolName="JMV";

        Student s2=new Student();
        System.out.println(s2.schoolName);

        Student s3=new Student();
        s3.schoolName="ABCD";
    }
}

class Student{
    static int returnPercentage(int math, int phy, int chem){ 
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolName;
    void setName(String Name){
        this.name=name; //this keyword
    }
    String getName(){
        return this.name;
    }
}