public class ThreadTest1 extends Thread{
    public void run(){
        System.out.println("1");
    }
}
class test3{
    public static void main(String[] args) {
        ThreadTest1 Thread1 = new ThreadTest1();
        Thread1.start();
        MyThread Thread2 = new MyThread();
        Thread Thread = new Thread(Thread2);
        Thread.start();
    }
}
