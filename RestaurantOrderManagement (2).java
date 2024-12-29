public class RestaurantOrderManagement {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Tasty Bites", "123 Main Street");
        restaurant.addMenuItem(new MenuItem("Burger", 5.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Fries", 2.99, "Side"));
        restaurant.addMenuItem(new MenuItem("Coke", 1.99, "Drink"));
        restaurant.addMenuItem(new MenuItem("Salad", 4.99, "Appetizer"));

        System.out.println("Original Menu:");
        System.out.println(restaurant);
        System.out.println("\nFiltered by category 'Drink':");
        restaurant.filterByCategory("Drink").forEach(System.out::println);
        System.out.println("\nMenu sorted by price (ascending):");
        restaurant.sortByPrice(true).forEach(System.out::println);
        System.out.println("\nSearching for items containing 'Fries':");
        restaurant.searchByName("Fries").forEach(System.out::println);
        MenuItem[] orderItems = {new MenuItem("Burger", 5.99, "Main Course"),
                                 new MenuItem("Coke", 1.99, "Drink")};
        Order dineInOrder = new DineInOrder(1, "Alice", orderItems, "Table 5");
        Order takeawayOrder = new TakeawayOrder(2, "Bob", orderItems, "6:00 PM");

        System.out.println("\nOrders:");
        System.out.println(dineInOrder);
        System.out.println(takeawayOrder);
    }
}
