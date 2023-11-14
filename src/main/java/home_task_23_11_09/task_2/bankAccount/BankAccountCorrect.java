package home_task_23_11_09.task_2.bankAccount;

public class BankAccountCorrect {
    private String accountNumber;
    private double balance;

    public BankAccountCorrect(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Логика внесения средств
        balance += amount;
    }

    public void withdraw(double amount) {
        // Логика снятия средств
        balance -= amount;
    }

    // Геттеры для получения значений (инкапсуляция)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
