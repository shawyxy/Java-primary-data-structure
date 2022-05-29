interface Num {
    public void setIHumanNum(int HumanNum);
    public int getIHumanNum();
}
class PassageCar extends Car implements Num{
    private int humanNum;

    public PassageCar(int carId, String carName, int humanNum) {
        super(carId, carName);
        this.humanNum = humanNum;
    }

    @Override
    public String getCapacity() {
        return "载人数：" + humanNum + "人";
    }

    @Override
    public void setIHumanNum(int HumanNum) {
        this.humanNum = humanNum;
    }

    @Override
    public int getIHumanNum() {
        return humanNum;
    }
}