public class ParkingRate {
    private double hours;
    private double rate;

    public double calculate(double duration, Vehicle vehicle, ParkingSpot spot) {
        int hrs = (int) Math.ceil(duration);
        double fee = 0;
        if (hrs >= 1) {
            fee += 50;
        }
        if (hrs >= 2) {
            fee += 20;
        }
        if (hrs >= 3) {
            fee += 20;
        }
        if (hrs > 4) {
            fee += (hrs - 3) * 1.5;
        }
        return fee;
    }
}
