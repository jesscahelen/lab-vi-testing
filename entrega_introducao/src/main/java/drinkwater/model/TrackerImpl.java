package drinkwater.model;

public class TrackerImpl implements Tracker {

    public TrackerImpl() {
    }

    public Double getProgress() {
        return 10.0;
    }

    @Override
    public Double addWaterConsumed(Double water) {
        return 100.0;
    }

    @Override
    public Double removeWaterConsumed(Double water) {
        return 0.0;
    }
}
