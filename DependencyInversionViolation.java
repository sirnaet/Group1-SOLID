public class DependencyInversionViolation {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.useKeyboard();
    }
}

class Keyboard {
    public void input() {
        System.out.println("Typing on the keyboard...");
    }
}

class Computer {
    private Keyboard keyboard;

    public Computer() {
        this.keyboard = new Keyboard();
    }

    public void useKeyboard() {
        keyboard.input();
    }
}
