package Taller01;

public class ElectronicWallet {
    private String owner;
    private double balance;

    public ElectronicWallet(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean topUp(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean pay(double amount) {
        if (amount > 0 && amount <= this.balance && amount <= 500000.0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}