package DSA_CODING_2025_20LPA.AMIT_BASIC_FIRST;

/*
⚙️ Step 1: What are Threads?

Imagine:

Two people (Thread 1 and Thread 2)

One shared notebook (the variable count)

Each person writes only when it’s their turn

So both need to coordinate using a rule:
👉 “Only one person can touch the notebook at a time.”

That’s what synchronized does in Java.

⚙️ Step 2: What is synchronized?

When we write:

synchronized (lock) {
   // some code
}


It means:

Only one thread at a time can go inside this block using the same lock object.

The other thread has to wait until the first thread is done.

It’s like:

Thread 1 locks the notebook, writes something, and unlocks it.

Then Thread 2 gets a turn.

⚙️ Step 3: Why do we use wait() and notify()?

Even inside a synchronized block, we still need a way to say:

“It’s not my turn, I’ll wait.”

“I’m done, now your turn.”

In Java:

wait() means → go to sleep and release the lock.

notify() means → wake up the waiting thread.

But — ⚠️ very important rule:

You can only call wait() or notify() when you are inside synchronized(lock)
(i.e., when you already hold that lock).

If you call wait() outside of synchronized,
Java throws this error:

IllegalMonitorStateException: current thread is not owner


This means:

“You are trying to wait, but you don’t own the notebook lock.”
 */

public class Print1to10Using2threads {
    private static int count = 1;       // start from 1
    private static final int MAX = 10;  // end at 10
    private static final Object lock = new Object();  // shared notebook


    private static void printNumbers(int remainder) {
        while (count <= MAX) {
            synchronized (lock) {  // only one thread can enter here
                while (count % 2 != remainder) { // not my turn
                    try {
                        lock.wait(); // wait until other thread signals
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // now it's my turn
                if (count <= MAX) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;          // move to next number
                    lock.notifyAll(); // tell other thread: your turn
                }
            }
        }
    }
     static void main(String[] args) {
        // Thread 1 → for odd numbers
        Thread oddThread = new Thread(() -> printNumbers(1), "Odd-Thread");

        // Thread 2 → for even numbers
        Thread evenThread = new Thread(() -> printNumbers(0), "Even-Thread");

        oddThread.start();
        evenThread.start();
    }

}