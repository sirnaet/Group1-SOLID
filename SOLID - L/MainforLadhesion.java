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