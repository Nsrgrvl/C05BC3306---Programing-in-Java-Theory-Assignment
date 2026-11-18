public class ExceptionPropagationDemo {
    
    // Exception occurs here, but is not handled
    void method3() {
        int result = 50 / 0; // ArithmeticException
    }
    
    // Exception propagates through this method
    void method2() {
        method3();
    }
    
    // Exception is finally caught and handled here
    void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method1: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        obj.method1();
        System.out.println("Normal program execution continues...");
    }
}