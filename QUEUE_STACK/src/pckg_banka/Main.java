package pckg_banka;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Mesa Verde");
        BankStands no1 = new BankStands(0);
        BankStands no2 = new BankStands(0);
        BankStands no3  =new BankStands(0);
        Customer customer1 = new Customer("Josip");
        int n = 0;
        while (n < 30){
            bank.addCustomerToQueue(customer1);
            n++;
        }
        bank.startTransactionsOnBankStand(no1, no2, no3);
    }
}
