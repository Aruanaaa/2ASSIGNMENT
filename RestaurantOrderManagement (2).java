package com.restaurant;

import java.util.Scanner;

public class RestaurantOrderManagement {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Tasty Bites", "123 Main Street");

        restaurant.addMenuItem(new MenuItem("Burger", 5.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Fries", 2.99, "Side"));
        restaurant.addMenuItem(new MenuItem("Coke", 1.99, "Drink"));
        restaurant.addMenuItem(new MenuItem("Salad", 4.99, "Appetizer"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Restaurant Menu Management ---");
            System.out.println("1. View Menu");
            System.out.println("2. Filter by Category");
            System.out.println("3. Search by Name");
            System.out.println("4. Sort by Price");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Menu:");
                    System.out.println(restaurant);
                    break;
                case 2:
                    System.out.print("Enter category to filter: ");
                    String category = scanner.nextLine();
                    restaurant.filterByCategory(category).forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    restaurant.searchByName(name).forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Sort by price (true for ascending, false for descending): ");
                    boolean ascending = scanner.nextBoolean();
                    restaurant.sortByPrice(ascending).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
