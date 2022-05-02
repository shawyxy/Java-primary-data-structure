import java.util.Scanner;

public class Testdemo {
    public static void main(String[] args) {
        
    }
    public static void main6(String[] args) {
        for (int i = 0; i <= 999 ; i++) {
            int x = i % 10;
            int y = (i % 100 - (x)) / 10;
            int z = i / 100;
            if(x*x*x + y*y*y + z*z*z == i){
                System.out.println(i);
            }
        }
    }
    public static void main5(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 9 || i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main4(String[] args) {
        int flg = 1;
        float num = 0f;
        float sum = 0f;
        for (int i = 1; i <= 100 ; i++) {
            num = (1 / i) * flg;
            flg = -flg;
            sum += num;
        }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        int flg = 0;
        for (int i = 1; i <= 100 ; i++) {
            flg = 0;
            for (int j = 2; j <= i / 2 ; j++) {
                if(i % j == 0){
                    flg = 1;
                    break;
                }
            }
            if(flg != 1){
                System.out.println(i);
            }
        }
    }
    public static void main2(String[] args) {
        int n = 101;
        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0){
                System.out.println("不是素数");
                break;
            }else{
                System.out.println(("是素数"));
                break;
            }
        }
    }
    public static void main1(String[] args) {
        int n = 20;
        if(n < 18){
            System.out.println("少年");
        }else if(n >= 18 && n <= 28){
            System.out.println("青年");
        }else if(n >= 29 && n <= 55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }
}
