// A correct implementation of a producer and consumer.
class Q {
//    int n;
    boolean valueSet = false;
    synchronized void printOdd(int n) {
        while(!valueSet)
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println(Thread.currentThread().getName() + ": " + n);
        valueSet = false;
        notify();
    }
    synchronized void printEven(int n) {
        while(valueSet)
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
//        this.n = n;
        valueSet = true;
        System.out.println(Thread.currentThread().getName() + ": " + n);
//        try {
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException ex) {
//            System.out.println(ex);
//        }
        notify();
    }
}
class EvenThread implements Runnable {
    Q q;
    EvenThread(Q q) {
        this.q = q;
        new Thread(this, "EvenThread").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.printEven(i);
            q.printOdd((i));
            i += 2;
        }
    }
}
class OddThread implements Runnable {
    Q q;
    OddThread(Q q) {
        this.q = q;
        new Thread(this, "OddThread").start();
    }
    public void run() {
        int i = 1;
        while(true) {
            q.printOdd(i);
            i += 2;
        }
    }
}
class PCFixed {
    public static void main(String args[]) {
        Q q = new Q();
        new EvenThread(q);
        new OddThread(q);
        System.out.println("Press Control-C to stop.");
    }
}