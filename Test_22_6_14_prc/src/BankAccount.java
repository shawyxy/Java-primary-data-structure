public class BankAccount{
    private String username;
    private int number;
    private float balance;

    BankAccount(String username, int number, int balance){
        this.username=username;
        this.number=number;
        this.balance=balance;
    }
    BankAccount(){
        //this("", 0, 0);
    }
    public String getUsername(){
        return username;
    }
    public int getNumber(){
        return number;
    }
    public float getBalance(){
        return balance;
    }

    void setUsername(String username){
        this.username = username;
    }
    void setNumber(int number){
        this.number=number;
    }
    void setBalance(float balance){
        this.balance = balance;
    }
    public String toString(){
        return ("account="+number+",balance"+balance);
    }
    public float deposit(float amount){
        balance+=amount;
        return balance;
    }
    public float withdraw(float amount){
        balance-=amount;
        return balance;
    }

}
class test{
    public static void main(String args[]){
        BankAccount account = new BankAccount("xiaoming", 123,3);
        account.setBalance(account.getBalance()+100);
        System.out.println(account);
    }
}