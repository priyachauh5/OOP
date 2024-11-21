
/*--------------------------------------------------------------------------------------------------------------------------
Multiple Inheritance
-Java does not support multiple inheritance it is supported by C++
- It is implemented using Interfaces.
Interface
-It is used to implement multiple inheritance
-All methods are  public, abstract and without implementation
-Variables in interface are private, public and static
----------------------------------------------------------------------------------------------------------------------------*/

// Interface
import java.util.*;
public class MultipleInheritanceAndInterface{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves(); //blueprint -> which defines an object behieverbydefault public and abstract
}
class Queen implements ChessPlayer{
    public void moves(){ //public likhna padega nhi tho bydefault ho jayega
        System.out.print("up, down, left, right, diagonal(in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){ //public likhna padega nhi tho bydefault ho jayega
        System.out.print("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){ //public likhna padega nhi tho bydefault ho jayega
        System.out.print("up, down, left, right, diagonal(by 1 step)");
    }
}

//multiple inheritance
// import java.util.*;
// public class OOPs{
//     public static void main(String args[]){
//         Bear bear=new Bear();
//         bear.her();
//         bear.car();
//     }
// }

// interface Herbivore{
//     void her();
// }
// interface Carnivore{
//     void car();
// }
// class Bear implements Herbivore, Carnivore{
//     public void her(){
//         System.out.println("Eats leaves");
//     }
//     public void car(){
//         System.out.println("Eats meats");
//     }
// }