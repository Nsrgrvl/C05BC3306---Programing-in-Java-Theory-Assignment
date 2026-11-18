class NameThread extends Thread {
    public void run() {
        String[] names = {"Amit", "Rahul", "Priya"};
        for (String name : names) {
            System.out.println("Student Name: " + name);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class MarksThread extends Thread {
    public void run() {
        int[] marks = {85, 78, 92};
        for (int mark : marks) {
            System.out.println("Student Mark: " + mark);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        NameThread t1 = new NameThread();
        MarksThread t2 = new MarksThread();
        
        t1.start();
        t2.start();
    }
}