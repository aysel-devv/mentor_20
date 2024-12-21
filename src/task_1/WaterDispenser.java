package task_1;

public class WaterDispenser {
    private int totalWater = 20;

    public synchronized void dispenseWater(int liters) {
        if (liters <= totalWater) {
            totalWater -= liters;
            System.out.println(Thread.currentThread().getName() + " dispense " + liters + ". Total water: " + totalWater);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to dispense " + liters + " unavailable");
        }
    }

    public int getRemainingWater() {
        return totalWater;
    }
}


