import java.util.Date;

public abstract class Payment {
    public double amount;
    public PaymentStatus status;
    public Date timestamp;

    public Payment(double amount){
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
        this.timestamp = new Date();
    }

    public abstract boolean initiateTransaction();
}
