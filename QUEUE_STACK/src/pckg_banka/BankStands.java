package pckg_banka;

public class BankStands {

    private int id;
    private static int cntID = 1;
    private float processingTime;
    private boolean statusProcessing;

    public BankStands(float processingTime){
        this.id = cntID++;
        this.processingTime = processingTime+id;
        statusProcessing = true;
    }

    public void changeBankStandStatus(boolean newStatus){
        this.statusProcessing = newStatus;
    }

    @Override
    public String toString() {
        return "BankStands{" +
                "id=" + id +
                ", processingTime=" + processingTime +
                ", statusProcessing=" + statusProcessing +
                '}';
    }

    public float getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(float processingTime) {
        this.processingTime = processingTime;
    }

    public boolean isStatusProcessing() {
        return statusProcessing;
    }

}
