/*--------------------------------------------------------------------------------------------------------------------------
Encapsulation
-It is defined as the wrapping up of data and method under a single 
-It also implements data hiding
----------------------------------------------------------------------------------------------------------------------------*/

// Main class to test encapsulation
public class Encapsulation{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// Class definition
public class Person {
    // Private variables
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int newAge) {
        if (newAge > 0) { // Simple validation
            this.age = newAge;
        }
    }
}

