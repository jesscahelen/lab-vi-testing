package drinkwater.model;

public class TrackerImpl implements Tracker {

    private Double progress;
    private Double goal;
    private Double waterConsumed;

    public TrackerImpl() {
    }

    public Double getProgress() {
        this.progress = (this.waterConsumed/this.goal)*100;
        return this.progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public Double getGoal() {
        return goal;
    }

    public void setGoal(Double goal) {
        this.goal = goal;
    }

    public Double getWaterConsumed() {
        return waterConsumed;
    }

    public void setWaterConsumed(Double waterConsumed) {
        this.waterConsumed = waterConsumed;
    }


    @Override
    public Double addWaterConsumed(Double water) {
        if (this.waterConsumed == null) {
            this.waterConsumed = 0.0;
        }
        this.waterConsumed = this.waterConsumed + water;
        return this.waterConsumed;
    }

    @Override
    public Double removeWaterConsumed(Double water) {
        if (this.waterConsumed == null) {
            this.waterConsumed = 0.0;
        } else {
            this.waterConsumed = this.waterConsumed - water;
        }
        return this.waterConsumed;
    }
}
