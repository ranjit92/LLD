import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date entryTime;
    private Date exitTime;
    private double amount;
    private TicketStatus status;

    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
