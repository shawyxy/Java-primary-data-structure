public class MyThread3 extends Thread {
    public void run() {
        System.out.println("1");
    }
}
class MyThread4 implements Runnable{
    public void run(){
        System.out.println("2");
    }
}
