public class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public boolean initiateTransaction() {
        status = PaymentStatus.COMPLETED;
        System.out.println("Cash payment of Rs. " + amount + "completed.");
        return true;
    }
}
