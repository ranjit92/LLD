public class Vehicle {
    private String licenseNo;
    private ParkingTicket ticket;

    public Vehicle(String licenseNo){
        this.licenseNo = licenseNo;
    }
    public void assignTicket(ParkingTicket ticket){
        this.ticket = ticket;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }
}
