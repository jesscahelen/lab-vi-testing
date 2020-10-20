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
        if (goal < 0) {
            return false;
        }
        this.goal = goal;
        return true;
    }

    public Double getWaterConsumed() {
        return waterConsumed;
    }

    public void setWaterConsumed(Double waterConsumed) {
        this.waterConsumed = waterConsumed;
    }


    @Override
    public Boolean addWaterConsumed(Double water) {
        if (water < 0 || water > goal) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean removeWaterConsumed(Double water) {
        if (water < 0 || water > goal) {
            return false;
        }
        return true;
    }


}
