package drinkwater.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrackerTest {

    @Test
    public void assertProgressTest(){
        Tracker tracker = new TrackerImpl();
        Assertions.assertEquals(tracker.getProgress(), ((Double)10.0));
    }

    @Test
    public void assertAddWaterConsumedTest(){
        Tracker tracker = new TrackerImpl();
        Assertions.assertEquals(tracker.addWaterConsumed(100.0), ((Double)100.0));
    }

    @Test
    public void assertRemoveWaterConsumedTest(){
        Tracker tracker = new TrackerImpl();
        Assertions.assertEquals(tracker.removeWaterConsumed(100.0), ((Double)0.0));
    }
}
