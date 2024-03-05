public class CarBuilder implements Builder {

    Car result = new Car();

    @Override
    public void reset() {
        this.result = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.result.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.result.engine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.result.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean gps) {
        this.result.gps = gps;
    }

    public Car getResult() {
        return this.result;
    }

}
