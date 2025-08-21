import java.util.Date;

public class ParkingTicket {
    private static int ticketSeed = 1000;
    private int ticketNo;
    private int slotNo;
    private Date entryTime;
    private Date exitTime;
    private double amount;
    private TicketStatus status;

    private Vehicle vehicle;
    private Payment payment;

    public ParkingTicket(int slotNo, Vehicle vehicle){

        this.ticketNo = ticketSeed++;
        this.slotNo = slotNo;
        this.vehicle = vehicle;
        this.entryTime = new Date();
        this.status = TicketStatus.ISSUED;
        vehicle.assignTicket(this);
        System.out.println("Ticket issued: " + ticketNo);
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
