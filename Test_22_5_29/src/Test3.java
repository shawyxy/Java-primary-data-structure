public class Test3 {
    public static void main(String[] args) {
        Car [] cars = {new PassageCar(1,"AudiA4",5),
                new PassageCar(2,"Wuling",7)};
        int PeopleNumber = 0;
        for (Car a:cars){
            PeopleNumber += ((PassageCar)a).getIHumanNum();
        }
        System.out.println("共载" + PeopleNumber + "人");
    }
}