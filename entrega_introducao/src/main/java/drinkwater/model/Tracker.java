package drinkwater.model;

public interface Tracker {

    public Double getProgress();

    public Double addWaterConsumed(Double water);

    public Double removeWaterConsumed(Double water);
}
