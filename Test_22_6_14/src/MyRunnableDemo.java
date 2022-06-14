public class MyRunnableDemo  {
//    public static void main(String[] args) {
//        Myrunnable my = new Myrunnable();
//        Thread t1 = new Thread(my,"gaotie");
//        Thread t2 = new Thread(my,"gaotie");
//        t1.start();
//        t2.start();
//
//    }
//public static void main(String[] args) {
//    MyThread m1 = new MyThread();
//    MyThread m2 = new MyThread();
//
//    m2.start();
//    m1.start();
//}
public static void main(String[] args) {
    Myrunnable my = new Myrunnable();
    Thread t1 = new Thread(my);
    Thread t2 = new Thread(my);

    t1.start();
    t2.start();

}
}
