////声明一个Person类
//class Person {
//    //成员变量
//    public int age = 18;
//    public String name = "xiaoming";
//    public String sex;
//    //成员方法
//    public void eat() {
//        System.out.println("吃饭");
//    }
//    public void sleep() {
//        System.out.println("睡觉");
//    }
//
//    public void speek() {
//        System.out.println("我叫"+name+",我"+age+"了");
//    }
//}
//class Test {
//    public int a = 10;
//    public static int count = 0;
//}
////public class TestDemo {
////    public static void main1(String[] args) {
////        Test test1 = new Test();
////        test1.a++;
////        Test.count++;
////
////        System.out.println(test1.a);
////        System.out.println(Test.count++);
////
////        System.out.println("-------------");
////
////        Test test2 = new Test();
////        test2.a++;
////        Test.count++;
////
////        System.out.println(test1.a);
////        System.out.println(Test.count++);
////    }
////
////    public static void main(String[] args) {
////        Test1.func();
////    }
////}
//class Test1 {
//    //这是一个静态成员变量
//    public static int a = 1;
//    //这是一个静态方法
//    public static void func() {
//        System.out.println("这是一个静态方法");
//
//    }
//    public void func1() {
//        System.out.println("这是一个普通方法");
//        System.out.println(a);
//
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//        Test1.func();
//        System.out.println(Test1.a);
//
//
//    }
//}
//class Person {
//    private int age;
//    private String name;
//    //设置名字
//    public Person(int age) {
//        this.age = age;
//    }
//    public Person(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//    public void print() {
//        System.out.println("age:" + age+" name:"+name);
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//        Person person = new Person(18,"小明");
//        person.print();
//        Person person1 = new Person(20,"小明");
//        person1.print();
//    }

class Person {
    private int age;
    private String name;
    private static int s;

    //这是一个构造方法
    Person() {
        System.out.println("构造方法");
    }
    //这是一个实例代码块
    {
        System.out.println("实例代码块");
    }
    //这是一个静态代码块
    static {
        s++;
        System.out.println("静态代码块");
    }
    //打印方法
    public void print() {
        //System.out.println("age:" + age+" name:"+name);
        System.out.println("静态成员变量s="+s);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //new一个对象
        Person person = new Person();
        //打印
        person.print();
        System.out.println("---------");
        //再new一个对象
        Person person1 = new Person();
        person1.print();
    }
}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        System.out.println("hello world");
//    }
//}
