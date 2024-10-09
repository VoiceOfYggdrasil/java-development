package com.pluralsight;

import java.util.*;

public class Store {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        Collections.sort(inventory, Comparator.comparing(Product::getName));

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(15043, "Playstation 5", 500.00));
        inventory.add(new Product(60547, "Nikon D3500", 600.00));
        inventory.add(new Product(33023, "Lenovo Ideapad", 800.00));
        inventory.add(new Product(92164, "Samsung S22", 1000.00));
        inventory.add(new Product(50038, "Sennheiser HD590", 250.00));


        return inventory;
    }
}
