public abstract class  Car{
    private int carId;
    private String carName;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    Car(int carId, String carName){
        this.carId=carId;
        this.carName=carName;
    }
    public abstract String getCapacity();
}
class test{
    public static void main(String[] args) {
        Car[] cars ={(new Passagecar(1, "audi", 5)),
                (new Passagecar(2, "wuling", 7))};
        int num = 0;
        for(int i = 0; i  < cars.length;i++){
            num+=((Passagecar)cars[i]).getIHumanNum();
        }
        System.out.println(num);
    }
}