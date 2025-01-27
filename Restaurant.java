public class Restaurant {
    private String name;
    private String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Получение меню из базы данных
    public List<MenuItem> getMenuItemsFromDb() {
        return RestaurantDatabase.getMenuItems();  // Метод из класса RestaurantDatabase
    }

    // Добавление нового элемента меню
    public void addMenuItem(MenuItem menuItem) {
        RestaurantDatabase.addMenuItem(menuItem);
    }

    // И другие методы работы с базой данных...
}
