class PriorityThread extends Thread {
    // We can name the threads for better identification
    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        // Just showing that the thread can run
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Step 1: Create three thread objects
        PriorityThread t1 = new PriorityThread("Thread 1");
        PriorityThread t2 = new PriorityThread("Thread 2");
        PriorityThread t3 = new PriorityThread("Thread 3");

        // Step 2: Set priorities using built-in constants
        // MIN_PRIORITY = 1
        t1.setPriority(Thread.MIN_PRIORITY);
        
        // NORM_PRIORITY = 5 (Default)
        t2.setPriority(Thread.NORM_PRIORITY);
        
        // MAX_PRIORITY = 10
        t3.setPriority(Thread.MAX_PRIORITY);

        // Step 3: Display the priority of each thread as per the output format
        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
        System.out.println("Thread 3 Priority: " + t3.getPriority());
    }
}
