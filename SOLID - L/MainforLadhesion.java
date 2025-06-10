class Bird{
    public void flyx(){
        System.out.println("This bird can fly!!!");
    }

}
class Sparrow extends Bird{
 //Inherits the function flyx   
}

public class MainforLadhesion {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.flyx(); // This will call the inherited method from Bird
        Bird bird = new Bird();
        bird.flyx(); // This will also call the method from Bird
    }
}
// This adheres to the Liskov Substitution Principle (LSP) because Sparrow can be used wherever Bird is expected without altering the expected behavior.
// The Sparrow class inherits the flyx method from the Bird class, and it does not override it, thus maintaining the expected behavior of the Bird class.