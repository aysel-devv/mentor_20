package task_1;

public class WaterDispenserApp {
    public static void main(String[] args) throws InterruptedException {
        WaterDispenser waterDispenser = new WaterDispenser();

        Thread thread1 = new Thread(() -> new WaterDispenser().dispenseWater(1));
        Thread thread2 = new Thread(() -> new WaterDispenser().dispenseWater(2));
        Thread thread3 = new Thread(() -> new WaterDispenser().dispenseWater(1));

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Remaining water: "+waterDispenser.getRemainingWater());
    }
}
