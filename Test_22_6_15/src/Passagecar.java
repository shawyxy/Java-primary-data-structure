public  class Passagecar extends Car implements IHumanNum{
    private int humanNum;

    public Passagecar(int carId, String carName, int humanNum) {
        super(carId, carName);
        this.humanNum=humanNum;
    }
    @Override
    public int getIHumanNum(){
        return humanNum;
    }
    @Override
    public void setIHumanNum(int humanNum) {
        this.humanNum = humanNum;
    }
    @Override
    public String getCapacity() {
        return "共"+humanNum+"人";
    }
}