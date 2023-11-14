package home_task_23_11_09.task_2.bankAccount;
//TODO: Пример нарушения принципа инкапсуляции:
public class BankAccount {
    public String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}