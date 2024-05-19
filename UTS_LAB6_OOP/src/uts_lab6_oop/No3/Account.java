public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor dengan parameter id, name, dan balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor dengan parameter id dan name, default balance adalah 0
    public Account(String id, String name) {
        this(id, name, 0);
    }

    // Getter untuk id
    public String getID() {
        return id;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter untuk balance
    public int getBalance() {
        return balance;
    }

    // Method untuk menambah saldo
    public void credit(int amount) {
        balance += amount;
    }

    // Method untuk mengurangi saldo
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Method untuk transfer saldo ke akun lain
    public void transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Override method toString untuk representasi objek Account
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
