package piyush;

class mtrunable implements Runnable{
    public void run(){
        while(true) {
            System.out.println("i am a thread");
        }
    }
}
class mtrunable2 implements Runnable{
    public void run(){
        while(true) {
            System.out.println("i am thread2");
        }
    }
}
public class multithreading_using_implementing_runable_interface {
    public static void main(String[] args) {
       mtrunable t1 = new mtrunable();
       Thread g1 = new Thread(t1);
       mtrunable2 t2 = new mtrunable2();
       Thread g2 = new Thread(t2);
       g1.start();
       g2.start();
    }
}
