public class CreditCard extends Payment {
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public boolean initiateTransaction() {
        status = PaymentStatus.COMPLETED;
        System.out.println("Credit card payment of Rs." + amount + " completed.");
        return true;
    }
}
