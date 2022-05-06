public class TestDemo {
    public static void main10(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        for(int i = 3; i <= 6; i++){
            int cur = num3;

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
    }
    public static void main9(String[] args) {
        int n = 5;
        int num = fib(n);
        System.out.println(num);
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main8(String[] args) {
        int n = 111111;
        int num = numAdd(n);

        System.out.println(num);
    }
    public static int numAdd(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + numAdd(n / 10);
    }
    public static void main7(String[] args) {
        int n = 10;
        int num = addNum(n);
        System.out.println(num);
    }
    public static int addNum(int n){
        if( n == 1 ){
            return 1;
        }
        return n + addNum(n-1);
    }
    public static void main6(String[] args) {
        int n = 1234;
        printNum(n);
    }
    public static void printNum(int n){
        if( n > 9){
            printNum(n / 10);
        }
        System.out.print(n % 10 + " ");
    }
    public static void main5(String[] args) {
        int n = 5;

        int recursionNum = Recur(n);
        System.out.println(recursionNum);
    }

    public static int Recur(int n){
        if(n == 1)
            return 1;
        return n * Recur(n - 1);
    }
    public static void main4(String[] args) {
        int a = 1;
        int b = 2;
        int ret1 = Add(a, b);
        System.out.println(ret1);

        float c = 1.5f;
        float d = 2.5f;
        float ret2 = Add(c, d);
        System.out.println(ret2);
    }

    public static int Add(int a, int b){
        return a + b;
    }
    public static float Add(float a, float b){
        return a + b;
    }
    public static void main3(String[] args) {
        int[] arr = {10, 20}; swap(arr);
        System.out.println("a = " + arr[0] + " b = " + arr[1]);
    }

    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main2(String[] args) {
        int a = 1;
        int b = 2;
        Swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public  static void Swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main1(String[] args) {
        int n = 100;
        int sum = Sum(n);
        System.out.println(sum);
    }

    public static int Sum(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
