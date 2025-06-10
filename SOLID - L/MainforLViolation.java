class Bird{
    public void flyx(){
        System.out.println("This Bird can fly!!!");
    }
}

class Ostrich extends Bird{
    @Override
    public void flyx(){
        System.out.println("This Bird cannot fly at all !!!");
    }
}

public class MainforLViolation{
    public static void main(String args[]){
        Bird a = new Ostrich();
        a.flyx(); // This will cause a runtime error if Ostrich is not able to fly
    }
}
//Yous hould not be able to override a method in a subclass that is not applicable to the subclass.
// This is a violation of the Liskov Substitution Principle (LSP).
// The LSP states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.	