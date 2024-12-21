package task_2;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine=new CoffeeMachine();

        Thread thread1=new Thread(coffeeMachine::dispenseCoffee, "User 1");
        Thread thread2=new Thread(coffeeMachine::dispenseCoffee, "User 2");
        Thread thread3=new Thread(coffeeMachine::dispenseCoffee, "User 3");
        Thread thread4=new Thread(coffeeMachine::dispenseCoffee, "User 4");
        Thread thread5=new Thread(coffeeMachine::dispenseCoffee, "User 5");
        Thread thread6=new Thread(coffeeMachine::dispenseCoffee, "User 6");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        Thread agent=new Thread(()-> {
            try {
                Thread.sleep(2000);
                coffeeMachine.refillCoffee();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
                );


        agent.start();





    }
}
