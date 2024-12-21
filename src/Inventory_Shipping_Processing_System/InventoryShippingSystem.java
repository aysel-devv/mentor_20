package Inventory_Shipping_Processing_System;

import java.util.concurrent.locks.ReentrantLock;

public class InventoryShippingSystem {
    private final ReentrantLock inventoryLock = new ReentrantLock();
    private final ReentrantLock shippingLock = new ReentrantLock();

    public void processOrder() {
        inventoryLock.lock();
        try {
            if (shippingLock.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " inventory locked successfully!");
                } finally {
                    shippingLock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to lock shipping, retrying!");
            }
        } finally {
            inventoryLock.unlock();
        }

    }

}
