public class Cash extends Payment{
    @Override
    public boolean initiateTransaction() {
        return false;
    }
}
