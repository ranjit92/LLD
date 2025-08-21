public class Driver {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=============Parking lot system demo===============");

        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addParkingSpot(new Handicapped(1));
        parkingLot.addParkingSpot(new Large(2));
        parkingLot.addParkingSpot(new Compact(3));
        parkingLot.addParkingSpot(new MotorCycleSpot(4));

        Entrance entrance = new Entrance(1);
        Exit exit = new Exit(1);

        DisplayBoard board = new DisplayBoard(1);
        parkingLot.addDisplay(board);

        //--------Customer enters and parks-------
        System.out.println("Customer enters and park the vehicle");

        Vehicle car = new Car("KA01-3554-4567");
        System.out.println("Car " + car.getLicenseNo() + " arrives at entrance");
        ParkingTicket ticket = entrance.getTicket(car);

        System.out.println("Updating the display board after parking");
        board.update(parkingLot.getAllSports());
        board.showFreeSlot();

        //--------Customer exit and pay-------
        System.out.println("Customer exit and pay fee");

        System.out.println("Vehicle " + car.getLicenseNo() + " proceeds to exit");
        Thread.sleep(1500);
        exit.validateTicket(ticket);

        System.out.println("Updating the display board after exit");
        board.update(parkingLot.getAllSports());
        board.showFreeSlot();

    }
}
