public abstract class AbstractTest{

    String name;
    int a = 9;

    public  void myPrint(){
        System.out.println("hello");
    }
    public abstract void myPrint2();
}

class son2 extends AbstractTest{
    @Override
    public  void myPrint2(){
        System.out.println("test");
    }

}