
/*--------------------------------------------------------------------------------------------------------------------------
Access modifiers 
-It can be public or default 
-But it cannot be private and protected
----------------------------------------------------------------------------------------------------------------------------*/

public class AccessModifiers{
    public static void main(String args[]){

      BankAccount myAcc=new BankAccount();
      myAcc.username="priyachauhan";
      myAcc.setPassword("priya");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
        System.out.println("Password is set");
    }
}

class Pen{
    private String color;
    private int tip;
}

class Student{
    String namr;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}