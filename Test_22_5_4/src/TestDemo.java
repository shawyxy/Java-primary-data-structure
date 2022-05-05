import java.io.IOException;
import java.util.Scanner;

public class TestDemo {


    public static void main(String[] args) {

    }
    public static void main5(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 9 || i / 10 == 9) {
                //99只算了一次
                count++;
            }
        }
        System.out.println(count);

    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){//hasNext也可以
            int n = scanner.nextInt();//最后输入^+d结束
            System.out.println(n);
        }
        String str = scanner.nextLine();
        System.out.println(str);
        int n = scanner.nextInt();//读入整数
        System.out.println(n);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//读入整数
        System.out.println(n);
        String str = scanner.nextLine();
        System.out.println(str);

    }
    public static void main2(String[] args) throws IOException {
     char i = (char)System.in.read();//手动导入util包(alt+enter)
        System.out.println(i);
    }
    public static void main1(String[] args) {
        //读入
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(str);
        int n = scanner.nextInt();//读入整数
        System.out.println(n);

        scanner.close();//加不加都可
    }
}
