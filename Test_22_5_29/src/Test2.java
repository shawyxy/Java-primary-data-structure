public class Test2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("aa", 100, 100);
        account.setBalance(account.getBalance()+100);
        System.out.println(account);
    }
}