class BankAccount{
    private String name;
    private int number;
    private float balance;

    public BankAccount(String name, int number, float balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float deposit(float amount){
        balance += amount;
        return balance;
    }
    public float withdraw(float amount){
        balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "名字:" + name +" 账户：" + number + " 余额：" + balance;
    }
}