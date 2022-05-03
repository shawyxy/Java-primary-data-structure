public class TestDemo {
    public static void main(String[] args) {
        int n = 1234;

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

    public static void main1(String[] args) {
        int a = 24;
        int b = 18;
        int tmp = a % b;
        while( tmp != 0){
            a = b;
            b = tmp;
            tmp = a % b;
        }
        int Min = (a * b) / b;
        System.out.println("Max = " + b);
        System.out.println("Min = " + Min);
    }
}
