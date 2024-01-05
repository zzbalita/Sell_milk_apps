package phcom.phlynk.sell_milk.bills.data.model;

public enum PaymentMethod {
    CASH, ATM, G_PAY;

    public static PaymentMethod fromString(String text) {
        for (PaymentMethod method : PaymentMethod.values()) {
            if (method.name().equalsIgnoreCase(text)) {
                return method;
            }
        }
        return CASH;
    }
}
