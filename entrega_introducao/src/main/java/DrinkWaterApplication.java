import com.google.gson.Gson;
import drinkwater.model.TrackerImpl;

public class DrinkWaterApplication {
    public static void main(String[] args) {
        System.out.println("Beba água!");
        Gson gson = new Gson();
        TrackerImpl tracker = new TrackerImpl();
        tracker.setGoal(2000.0);
        tracker.setWaterConsumed(1800.0);
        tracker.getProgress();
        System.out.println(gson.toJson(tracker));
    }
}
