public class ThreadDemo {
    public static void main(String[] args) {
        MyThread3 Thread3 = new MyThread3();
        Thread3.start();
        MyThread4 Thread4 = new MyThread4();
        Thread Thread5 = new Thread(Thread4);
        Thread5.start();
    }
}

