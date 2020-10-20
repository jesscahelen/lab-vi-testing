package drinkwater.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Partições:
 *  - Goal:
 *      válido: > 0
 *      inválido: < 0
 *  - Consumo:
 *      válido: > 0 e < Goal
 *      inválido < 0 ou > Goal
 *
 */
public class TrackerTest {


    @Test
    public void testInvalidGoal(){
        TrackerImpl tracker = new TrackerImpl();
        Assertions.assertFalse(tracker.setGoal(-1.0));
    }

    @Test
    public void testValidGoal(){
        TrackerImpl tracker = new TrackerImpl();
        Assertions.assertTrue(tracker.setGoal(1.0));
    }

    @Test
    public void testInvalidNegativeAddConsume(){
        TrackerImpl tracker = new TrackerImpl();
        Assertions.assertFalse(tracker.addWaterConsumed(-1.0));
    }

    @Test
    public void testInvalidGraterThanGoalAddConsume(){
        TrackerImpl tracker = new TrackerImpl();
        tracker.setGoal(1000.0);
        Assertions.assertFalse(tracker.addWaterConsumed(1001.0));
    }

    @Test
    public void testValidAddConsume(){
        TrackerImpl tracker = new TrackerImpl();
        tracker.setGoal(1000.0);
        Assertions.assertTrue(tracker.addWaterConsumed(1.0));
    }

    @Test
    public void testValidGoalAddConsume(){
        TrackerImpl tracker = new TrackerImpl();
        tracker.setGoal(1000.0);
        Assertions.assertTrue(tracker.addWaterConsumed(10.0));
    }

    @Test
    public void testValidMiddleValueGoalAddConsume(){
        TrackerImpl tracker = new TrackerImpl();
        tracker.setGoal(1000.0);
        Assertions.assertTrue(tracker.addWaterConsumed(500.0));
    }
}
