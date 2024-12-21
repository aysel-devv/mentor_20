package task_2;

public class CoffeeMachine {
    private int cupsAvailable = 5;

    public synchronized void dispenseCoffee() {
        while (cupsAvailable == 0) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for coffee.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        cupsAvailable--;
        System.out.println(Thread.currentThread().getName()+" got coffee. Cups left: "+cupsAvailable);
    }

    public synchronized void refillCoffee() {
        cupsAvailable = 5;
        System.out.println("Refilled action is done!");
        notifyAll();
    }


}
