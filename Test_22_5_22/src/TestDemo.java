class AddOver{
    public int add(int a, int b){
        return a+b;
    }
    public int add( int a, int b, int c ){
        return a+b+c;
    }
}

 /*
         编写一个类Student，具有两个私有成员变量
         ：String类型name、整型age；方法：带两个参数构造方法为成员变量初始化、
         两私有成员变量的set方法和get方法、重写toString()方法显示Student信息。*/
class Student {
    private String name;
    private int age;

     @Override
     public String toString() {
         return "姓名：" + name + " 年龄：" + age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }


/*要求定义一个类Circle描述一个圆，并完成相应的操作：
        (1) 属性：圆心x坐标（xpoint）、圆心y坐标（ypoint）和半径（radius）。
        (2) 构造方法：给3个属性赋初值。
        (3) 实例方法（area）：求圆的面积。
        (4) 重写toString()方法，返回圆心坐标和半径。
        (5) 实例化这个类，调用方法完成信息的输出。*/
class Cricle {
    private double xpoint;
    private double ypoint;
    private double radius;

    public Cricle(double xpoint, double ypoint, double radius) {
        this.xpoint = xpoint;
        this.ypoint = ypoint;
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }

    public double getXpoint() {
        return xpoint;
    }

    public void setXpoint(double xpoint) {
        this.xpoint = xpoint;
    }

    public double getYpoint() {
        return ypoint;
    }

    public void setYpoint(double ypoint) {
        this.ypoint = ypoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "xpoint=" + xpoint +
                ", ypoint=" + ypoint +
                ", radius=" + radius +
                '}';
    }
}

public class TestDemo {

    public static void main1(String[] args) {
        Student zs = new Student();
        zs.setAge(18);
        zs.setName("张三");
        System.out.println(zs);
    }


    public static void main(String[] args) {
        Cricle cricle = new Cricle(1, 2, 3);
        cricle.area();
        System.out.println(cricle.area());
        System.out.println(cricle);
    }
}

