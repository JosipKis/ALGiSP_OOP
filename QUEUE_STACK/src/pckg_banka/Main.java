package pckg_banka;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Mesa Verde");
        BankStands no1 = new BankStands(0);
        BankStands no2 = new BankStands(0);
        BankStands no3  =new BankStands(0);
        int n = 0;
        while (n < 30){
            Customer customer = new Customer(Customer.generateName());
            bank.addCustomerToQueue(customer);
            n++;
        }
        bank.startTransactionsOnBankStand(no1, no2, no3);
    }
}
