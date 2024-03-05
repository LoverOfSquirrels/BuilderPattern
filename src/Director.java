public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeCar(Builder carbuilder) {
        this.builder = carbuilder;
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new Engine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
