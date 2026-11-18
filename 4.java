public class StringModificationDemo {
    public static void main(String[] args) {
        // Using StringBuilder for efficient loop modification
        StringBuilder builder = new StringBuilder("Numbers: ");
        
        long startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            builder.append(i).append(" ");
        }
        long endTime = System.nanoTime();
        
        System.out.println("First 50 chars: " + builder.substring(0, 50) + "...");
        System.out.println("Execution time (ns): " + (endTime - startTime));
    }
}