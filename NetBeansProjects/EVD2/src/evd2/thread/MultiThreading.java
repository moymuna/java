
package evd2.thread;

public class MultiThreading {

    public static void main(String[] args) {
        Runnable printA = new PrintChar('A', 10);
        Runnable printB = new PrintChar('B', 10);
        Runnable printC = new PrintChar('C', 10);

        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(printC);

        t1.start();
        t2.start();
        t3.start();
    }
}
