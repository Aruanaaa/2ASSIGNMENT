import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant {
    private String name;
    private String address;
    private List<MenuItem> menu;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> filterByCategory(String category) {
        return menu.stream()
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<MenuItem> sortByPrice(boolean ascending) {
        return menu.stream()
                .sorted(ascending ? Comparator.comparingDouble(MenuItem::getPrice)
                                  : Comparator.comparingDouble(MenuItem::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<MenuItem> searchByName(String name) {
        return menu.stream()
                .filter(item -> item.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }
}
