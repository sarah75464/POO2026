package Taller01;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("987654321", "Paola");

        System.out.println("Saldo inicial: " + account.getBalance());

        boolean dep1 = account.deposit(1500.0);
        System.out.println("Deposito 1500: " + dep1 + " | Saldo: " + account.getBalance());

        boolean dep2 = account.deposit(-200.0);
        System.out.println("Deposito -200: " + dep2 + " | Saldo: " + account.getBalance());

        boolean with1 = account.withdraw(500.0);
        System.out.println("Retiro 500: " + with1 + " | Saldo: " + account.getBalance());

        boolean with2 = account.withdraw(5000.0);
        System.out.println("Retiro 5000: " + with2 + " | Saldo: " + account.getBalance());

        boolean with3 = account.withdraw(-100.0);
        System.out.println("Retiro -100: " + with3 + " | Saldo: " + account.getBalance());
    }
}