public class Son  {
    private int age;
    private String name;

    public Son() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void myPrint() {
        System.out.println("我是父类");
    }

}
class Son1 extends Son{
      public  void myPrint() {
          super.myPrint();
        System.out.println("我是子类");
    }
        int age;
        String name;


}
class Test1{
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.myPrint();
    }

}