class Thread1 extends Thread{
    public boolean isPrimeNumber(int n){
        for(int i = 2; i <= Math.sqrt(n); i+=2){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public void run(){
        for(int i = 2; i <= 100; i++) {
            if(isPrimeNumber(i) == true) {
                int ran = (int)Math.random()*1000;
                System.out.println("i=" + i);
                try{
                    Thread.sleep(ran);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        for(int i = 20; i > 0; i--) {
            int ran = (int) (Math.random()*1000);
            System.out.println("j="+i);
            try {
                Thread.sleep(ran);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
public class ThreadTestDemo {
    public static void main(String[] args) {
        Thread1 Thread1 = new Thread1();
        Thread2 Thread = new Thread2();
        Thread Thread2 = new Thread(Thread);
        Thread1.start();
        Thread2.start();
    }

}
