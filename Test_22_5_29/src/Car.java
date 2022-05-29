abstract class Car{
    private int carId;
    private String carName;

    public Car(int carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

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
    public abstract String getCapacity();
}