package drinkwater.model;

public class TrackerImpl implements Tracker {

    private Double progress;
    private Double goal;
    private Double waterConsumed;

    public TrackerImpl() {
    }

    public Double getProgress() {
        return this.progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public Double getGoal() {
        return goal;
    }

    public Boolean setGoal(Double goal) {
        this.goal = goal;
        return null;
    }

    public Double getWaterConsumed() {
        return waterConsumed;
    }

    public void setWaterConsumed(Double waterConsumed) {
        this.waterConsumed = waterConsumed;
    }


    @Override
    public Boolean addWaterConsumed(Double water) {
        return null;
    }

    @Override
    public Boolean removeWaterConsumed(Double water) {
        return null;
    }
}
