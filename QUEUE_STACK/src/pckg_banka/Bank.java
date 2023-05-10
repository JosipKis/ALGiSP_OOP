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

    public Bank(String name){
        this.bankName = name;
        this.id = cntID++;
        this.stands = new TreeSet<>();
    }

    public void addStand(BankStands stand){
        this.stands.add(stand);
    }



}
