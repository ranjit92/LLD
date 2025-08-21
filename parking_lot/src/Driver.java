public class Driver {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=============Parking lot system demo===============");

        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addParkingSpot(new Large(2));
        parkingLot.addParkingSpot(new Compact(3));
        parkingLot.addParkingSpot(new MotorCycleSpot(4));
        parkingLot.addParkingSpot(new Handicapped(1));

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

        //filling parking lot and new vehicle get rejected
        System.out.println("Multiple customer attempt to enter and lot become full and rejecting new vehicle");

        Vehicle vehicle1 = new Van("KA01-3554-4567");
        ParkingTicket ticket1 = entrance.getTicket(vehicle1);

        Vehicle vehicle2 = new Car("KA01-3554-4568");
        ParkingTicket ticket2 = entrance.getTicket(vehicle2);

        Vehicle vehicle3 = new MotorCycle("KA01-3554-4569");
        ParkingTicket ticket3 = entrance.getTicket(vehicle3);

        Vehicle vehicle4 = new Car("KA01-3554-4510");
        ParkingTicket ticket4 = entrance.getTicket(vehicle4);

        System.out.println("Updating the display board after parking");
        board.update(parkingLot.getAllSports());
        board.showFreeSlot();

        //Trying to enter new one after full

        Vehicle vehicle5 = new Car("KA01-3554-4511");
        ParkingTicket ticket5 = entrance.getTicket(vehicle5);
        System.out.println("Unable to park the vehicle, ticket created: " + ticket5);

        board.update(parkingLot.getAllSports());
        board.showFreeSlot();
    }
}
