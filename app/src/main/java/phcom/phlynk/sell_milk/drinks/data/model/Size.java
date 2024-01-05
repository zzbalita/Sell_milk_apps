package phcom.phlynk.sell_milk.drinks.data.model;

public enum Size {
    SMALL, MEDIUM, LARGE;

    public String title() {
        switch (this) {
            case SMALL:
                return "Nhỏ";
            case MEDIUM:
                return "Vừa";
            default:
                return "Lớn";
        }
    }

    public static Size fromString(String text) {
        for (Size size : Size.values()) {
            if (size.name().equalsIgnoreCase(text)) {
                return size;
            }
        }
        return MEDIUM;
    }
}

