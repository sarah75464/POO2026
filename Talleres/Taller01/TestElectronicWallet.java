package Taller01;

public class TestElectronicWallet {
    public static void main(String[] args) {
        ElectronicWallet wallet = new ElectronicWallet("Carlos");

        System.out.println("Saldo inicial: " + wallet.getBalance());

        boolean topUp1 = wallet.topUp(600000.0);
        System.out.println("Recarga 600000: " + topUp1 + " | Saldo: " + wallet.getBalance());

        boolean topUp2 = wallet.topUp(-50000.0);
        System.out.println("Recarga -50000: " + topUp2 + " | Saldo: " + wallet.getBalance());

        boolean pay1 = wallet.pay(100000.0);
        System.out.println("Pago 100000: " + pay1 + " | Saldo: " + wallet.getBalance());

        boolean pay2 = wallet.pay(800000.0);
        System.out.println("Pago 800000: " + pay2 + " | Saldo: " + wallet.getBalance());

        boolean pay3 = wallet.pay(550000.0);
        System.out.println("Pago 550000: " + pay3 + " | Saldo: " + wallet.getBalance());

        boolean pay4 = wallet.pay(-20000.0);
        System.out.println("Pago -20000: " + pay4 + " | Saldo: " + wallet.getBalance());
    }
}