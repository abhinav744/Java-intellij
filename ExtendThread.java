//Create a second thread
class NewThread extends Thread{
    NewThread(){
        //create a new, second thread
        super("Demo thread");
        System.out.println("Child thread "+this);
        start();    //Start the thread
    }
    //This is the entry point of second thread
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child thread "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted ");
        }
        System.out.println("Exiting child thread ");
    }
}

public class ExtendThread {
    public static void main(String args[]){
        new NewThread();    //create new thread
        try {
            for(int i=5;i>0;i--){
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted ");
        }
        System.out.println("Main thread exiting ");
    }
}
