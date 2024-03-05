import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);

        director.makeCar(builder);
        Car car = builder.getResult();

        System.out.println(gson.toJson(car));
    }
}