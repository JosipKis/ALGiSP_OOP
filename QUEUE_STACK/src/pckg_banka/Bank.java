package pckg_banka;

import com.sun.source.tree.Tree;
import pckg_adt_queue.QUEUEARR;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Bank {

    private String bankName;
    private int id;
    private static int cntID = 100;
    private Set<BankStands> stands;
    private QUEUEARR<Customer> queue;
    private static final int BANKCAP = 30;

    public Bank(String name){
        this.bankName = name;
        this.id = cntID++;
        this.stands = new TreeSet<>();
        queue = new QUEUEARR<>(BANKCAP);

    }

    public void addStand(BankStands stand){
        this.stands.add(stand);
    }

    public void addCustomerToQueue(Customer customer){
        queue.enqueue(customer);
    }

    public void startTransactionsOnBankStand(BankStands no1, BankStands no2, BankStands no3){
        float timer = 0;
        if (queue.isEmpty()){
            System.out.println("There is no one waiting - the queue is empty!");
        }else {
            while (!queue.isEmpty()){
                float processingTime2 = no2.getProcessingTime();
                float processingTime3 = no3.getProcessingTime();
                if ((processingTime2 % 2) == 0){
                    no2.changeBankStandStatus(true);
                }
                if ((processingTime3 % 3) == 0){
                    no3.changeBankStandStatus(true);
                }
                System.out.println("Banker at stand no.1 processed a person.");
                queue.dequeue();
                if (no2.isStatusProcessing()){
                    System.out.println("Banker at stand no.2 processed a person.");
                    queue.dequeue();
                    no2.changeBankStandStatus(false);
                }
                if (no3.isStatusProcessing()){
                    System.out.println("Banker at stand no.3 processed a person.");
                    queue.dequeue();
                    no3.changeBankStandStatus(false);
                }
                timer++;
                no2.setProcessingTime(timer);
                no3.setProcessingTime(timer);
            }
        }
    }
}
