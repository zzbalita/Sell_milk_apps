package phcom.phlynk.sell_milk.drinks.data.model;

public enum MeasureUnit {
    L, ML, G, KG;

    public static MeasureUnit fromString(String text) {
        for (MeasureUnit unit : MeasureUnit.values()) {
            if (unit.name().equalsIgnoreCase(text)) {
                return unit;
            }
        }
        return KG;
    }
}