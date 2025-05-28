// Notice this class is declared as public
// This means other classes can create instances of it or call its methods
public class MyProgram {
    
    // The main method must also be public so the Java runtime can access it
    // This is like having a clearly marked entrance to your building
    public static void main(String[] args) {
        System.out.println("Running a public class!");
        
        // You can call other methods from here
        displayMessage();
        calculateSomething();
    }
    
    // This is a public method that other classes could call
    public static void displayMessage() {
        System.out.println("This message comes from a public method");
    }
    
    // This is a private method - only this class can use it
    private static void calculateSomething() {
        int result = 10 + 5;
        System.out.println("Calculation result: " + result);
    }
}