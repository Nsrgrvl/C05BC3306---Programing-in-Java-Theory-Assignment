public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {78, 85, 92, 65, 88};
        int highest = marks[0];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Marks array: [78, 85, 92, 65, 88]");
        System.out.println("Highest Marks: " + highest);
        System.out.println("Average Marks: " + average);
    }
}