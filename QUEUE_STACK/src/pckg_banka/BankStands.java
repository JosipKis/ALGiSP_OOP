package pckg_banka;

public class BankStands {

    private int id;
    private static int cntID = 1;
    private float processingTime;

    public BankStands(float processingTime){
        this.id = cntID++;
        this.processingTime = processingTime+id;
    }
}
