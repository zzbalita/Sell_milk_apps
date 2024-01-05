package phcom.phlynk.sell_milk.bills.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.drinks.data.model.MilkTeaOrder;

public final class MilkTeaOrderFactory {
    private static final List<MilkTeaOrder> orders = new ArrayList<>();

    public static void addOrder(MilkTeaOrder order) {
        order.setId((orders.size() + 1) + "");
        order.calculateCost();
        orders.add(order);
    }

    public static boolean addOneMoreOrder(MilkTeaOrder order) {
        return adjustQuantityToOrder(order, 1);
    }

    public static boolean subtractOneOrder(MilkTeaOrder order) {
        return adjustQuantityToOrder(order, -1);
    }

    public static boolean removeOrder(MilkTeaOrder order) {
        return orders.remove(order);
    }

    public static List<MilkTeaOrder> showCart() {
        return orders;
    }

    public static void clearCart() {
        orders.clear();
    }

    public static int estimatePrice() {
        int total = 0;
        for (MilkTeaOrder order : orders) {
            total += order.getTotalCost();
        }
        return total;
    }

    private static boolean adjustQuantityToOrder(MilkTeaOrder order, int biasQuantity) {
        int newQuantity = order.getQuantity() + biasQuantity;
        if (newQuantity <= 0) {
            // Xoá order, vì số lượng đã về 0
            return orders.remove(order);
        }
        order.setQuantity(newQuantity);
        order.calculateCost();
        return orders.contains(order);
    }
}

