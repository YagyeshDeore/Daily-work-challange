// Implement the interface in a class
public class MyClass implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello from MyInterface!");
    }

    @Override
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
        System.out.println("Sum: " + obj.addNumbers(5, 10));
    }
}
