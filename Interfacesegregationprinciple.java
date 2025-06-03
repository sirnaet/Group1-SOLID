// This one is a simple example of the Interface Segregation Principle (ISP) in Java. And it adheres to the principle by ensuring that interfaces are client-specific and not forcing clients to implement methods they do not use.

public interface Printer {
    void print();
}

public interface Scanner {
    void scan();
}

public class SimplePrinter implements Printer {
    public void print() {
        // the implementation of the print method
    }
}


//This interface implements the Printer and Scanner interfaces, but it does not force clients to implement methods they do not need. Hence it violates the Interface Segregation Principle (ISP).

public interface Machine {
    void print();
    void scan();
}

public class OldPrinter implements Machine {
    public void print() {
        // the implementation of the print method
    }

    public void scan() {
        throw new UnsupportedOperationException("Can't scan");
        // this implementation does not support scanning
    }
}
