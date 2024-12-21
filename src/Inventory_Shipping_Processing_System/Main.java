package Inventory_Shipping_Processing_System;

public class Main {
    public static void main(String[] args) {
        InventoryShippingSystem inv=new InventoryShippingSystem();

        Thread t1=new Thread(inv::processOrder);
        Thread t2=new Thread(inv::processOrder);
        Thread t3=new Thread(inv::processOrder);

        t1.start();
        t2.start();
        t3.start();
    }
}
