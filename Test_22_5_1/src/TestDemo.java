public class TestDemo {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.print("hello");
        System.out.print("world");
    }
    public static void main12(String[] args) {
        int i = 0;
        do{
            i++;
            System.out.println(i);
        }while(i <= 8);
    }

    public static void main11(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            if(i % 3 != 0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
    public static void main10(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main9(String[] args) {
        int ret = 1;
        int num = 0;
        for (int i = 1; i <= 5 ; i++) {
            ret = 1;
            for (int j = 1; j <= i ; j++) {
                ret *= j;
            }
            num += ret;
        }
        System.out.println(num);
    }
    public static void main8(String[] args) {
        int ret = 1;
        for (int i = 1; i <= 5 ; i++) {
            ret *= i;
        }
        System.out.println(ret);
    }
    public static void main7(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
    public static void main6(String[] args) {
        int n = 1;
        int ret = 1;
        int num = 0;
        while(n <= 5){
            int m = 1;
            ret = 1;
            while(m <= n){
                ret *= m;
                m++;
            }
            num += ret;
            n++;
        }

        System.out.println(num);
    }
    public static void main5(String[] args) {
        int n = 10;
        while(n != 0){
            System.out.println(n);
            n--;
        }
    }
    public static void main4(String[] args) {
        int n = 1;
        switch(n - 0){
            case 1 :
                System.out.println("1");
                break;
        }
    }
    public static void main3(String[] args) {
        int year = 2005;
        if( (year % 100 != 0 && year % 4 == 0) || year % 400 == 0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
    public static void main2(String[] args) {
        int year = 2000;
        if(year % 100 == 0){
            if(year % 4 == 0){
                System.out.println(year+"是闰年");
            }else{
                System.out.println(year+"不是闰年");
            }
        }else{
            if(year % 400 == 0){
                System.out.println(year+"是闰年");
            }else{
                System.out.println(year+"不是闰年");
            }
        }
    }

    public static void main1(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

    }
}
