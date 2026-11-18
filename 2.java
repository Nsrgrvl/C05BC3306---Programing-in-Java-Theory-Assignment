public class ExecutionOrderDemo {
    // 1. Static Initializer Block
    static {
        System.out.println("1. Static initializer block executed.");
    }

    // 2. Instance Initializer Block
    {
        System.out.println("3. Instance initializer block executed.");
    }

    // 3. Constructor
    public ExecutionOrderDemo() {
        System.out.println("4. Constructor executed (Object created).");
    }

    // 4. Method
    public void displayMessage() {
        System.out.println("5. Method executed.");
    }

    public static void main(String[] args) {
        System.out.println("2. Main method started.");
        ExecutionOrderDemo obj = new ExecutionOrderDemo();
        obj.displayMessage();
    }
}