public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void insufficientBalance() {
        System.out.println("Insufficient balance");
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from " + name + "'s account");
    }

    // Getters and setters for all properties
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}
