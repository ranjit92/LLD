import java.util.Date;

public class Exit {
    private int id;

    public Exit(int id) {
        this.id = id;
    }

    public void validateTicket(ParkingTicket ticket) {
        Date now = new Date();
        ticket.setExitTime(now);
        double hours = ((double) (now.getTime() - ticket.getEntryTime().getTime()) / (60 * 60 * 60));
        double fee = ParkingLot.getInstance().parkingRate.calculate(hours, ticket.getVehicle(), ParkingLot.getInstance().getParkingSpot(ticket.getSlotNo()));
        ticket.setAmount(fee);
        System.out.printf("Ticket no. %d || Parked: %.2f hours || Fee: %.2f", ticket.getTicketNo(), hours, fee);
        System.out.println();
        Payment payment = (fee > 10) ? new CreditCard(fee) : new Cash(fee);
        payment.initiateTransaction();
        ParkingLot.getInstance().freeSlot(ticket.getSlotNo());
        ticket.setStatus(TicketStatus.PAID);
    }
}
