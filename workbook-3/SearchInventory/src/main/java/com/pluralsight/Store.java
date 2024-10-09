package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(15043, "Playstation 5", 500.00);
        inventory.add(60547, "Nikon D3500", 600.00);
        inventory.add(33023, "Lenovo Ideapad", 800.00);
        inventory.add(92164, "Samsung S22", 1000.00);
        inventory.add(50038, "Sennheiser HD590", 250.00);

        return inventory;
    }
}
