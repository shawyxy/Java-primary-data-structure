public class Parent {
    public void eat() {
        System.out.println("父吃饭");
    }
    private int age;
    private String name;

    Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Parent() {

    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if(age > 0 && age <200){
            this.age = age;
        }
    }
    public void setName(String name) {
        this.name = name;
    }

}



class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        parent.eat();
//        parent.setAge(18);
        int age = parent.getAge();
        System.out.println(age);
    }

}
