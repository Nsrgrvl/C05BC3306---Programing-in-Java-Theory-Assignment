class StudentAccount {
    private int balance = 1000;

    // The 'synchronized' keyword ensures only one thread can execute this at a time
    public synchronized void updateBalance(int amount, String threadName) {
        System.out.println(threadName + " is updating balance...");
        int newBalance = balance + amount;
        
        // Simulating processing time that usually causes race conditions
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        
        balance = newBalance;
        System.out.println(threadName + " finished. Final Balance: " + balance);
    }
}

class UpdateThread extends Thread {
    StudentAccount account;
    int amount;

    UpdateThread(StudentAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.updateBalance(amount, Thread.currentThread().getName());
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        StudentAccount acc = new StudentAccount();
        UpdateThread t1 = new UpdateThread(acc, 500, "Thread 1");
        UpdateThread t2 = new UpdateThread(acc, 300, "Thread 2");

        t1.start();
        t2.start();
    }
}