package code._4_student_effort.challenge2_bank_transactions;

public class TransactionThread extends Thread {

    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        super(name);
        this.from=from;
        this.to=to;
        this.amount=amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
