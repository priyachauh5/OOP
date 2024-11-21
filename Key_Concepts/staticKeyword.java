
/*--------------------------------------------------------------------------------------------------------------------------
Static Keyword
-It is used when we need same properties or functions
-It keep constants to variables which can be used throughout the program
-Benefits: i.uses less memory/ Memory efficient
           ii.no need to create multiple string
-Static can be: i.Properties.
                ii.Functions.
                iii.Blocks.
                iv.Nested class
----------------------------------------------------------------------------------------------------------------------------*/

public class staticKeyword{
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
    static String schoolName;      //Here SchoolName is kept static
    void setName(String Name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}

// Agar static nahi hai tho class ke through access nhi kar sakti bus object ke through access kar saktehai 
// agar class access karna tho class static hona chahiye