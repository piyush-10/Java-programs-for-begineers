package piyush;
class mythread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("my thread is running");
            System.out.println("i am happy");
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("mt thread2 is running");
            System.out.println("i am sad");
        }
    }
}
public class multithreading_using_extending_threadclass {
    public static void main(String[] args) {
    mythread t1 = new mythread();
    mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}
