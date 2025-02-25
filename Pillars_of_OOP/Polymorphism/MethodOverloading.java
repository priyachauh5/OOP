/*--------------------------------------------------------------------------------------------------------------------------
Method Overloading
-multiple functions with same name but different parameters
----------------------------------------------------------------------------------------------------------------------------*/

//method overloading at compile time
import java.util.*;
public class MethodOverloading{
    public static void main(String args[]){
         Calculator cal=new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.5,(float)1.2));
        System.out.println(cal.sum(1,2,3));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}