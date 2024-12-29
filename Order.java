import java.util.Arrays;

public class Order {
    private int orderId;
    private String customerName;
    private MenuItem[] items;

    public Order(int orderId, String customerName, MenuItem[] items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public MenuItem[] getItems() {
        return items;
    }

    public void setItems(MenuItem[] items) {
        this.items = items;
    }

    public double calculateTotal() {
        return Arrays.stream(items).mapToDouble(MenuItem::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", items=" + Arrays.toString(items) +
                ", total=" + calculateTotal() +
                '}';
    }
}

class DineInOrder extends Order {
    private String tableNumber;

    public DineInOrder(int orderId, String customerName, MenuItem[] items, String tableNumber) {
        super(orderId, customerName, items);
        this.tableNumber = tableNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Table Number='" + tableNumber + "'";
    }
}

class TakeawayOrder extends Order {
    private String pickupTime;

    public TakeawayOrder(int orderId, String customerName, MenuItem[] items, String pickupTime) {
        super(orderId, customerName, items);
        this.pickupTime = pickupTime;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pickup Time='" + pickupTime + "'";
    }
}
