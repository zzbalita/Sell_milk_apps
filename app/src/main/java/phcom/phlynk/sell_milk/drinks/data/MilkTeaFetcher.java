package phcom.phlynk.sell_milk.drinks.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.drinks.data.model.MilkTea;
import phcom.phlynk.sell_milk.drinks.data.model.RealIngredient;

public class MilkTeaFetcher {
    public static ArrayList<MilkTea> fakeMilkteas() {
        ArrayList<MilkTea> milkTeas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            milkTeas.add(MilkTeaFetcher.fakeOneMilkTea());
        }
        return milkTeas;
    }

    private static MilkTea fakeOneMilkTea() {
        List<RealIngredient> realIngredients = new ArrayList<>();
        realIngredients.add(new RealIngredient("1", "Tran trau trang", "KG", 70000, 0.1f));
        realIngredients.add(new RealIngredient("1", "Tran trau den", "KG", 70000, 0.1f));
        realIngredients.add(new RealIngredient("1", "Tran trau hong", "KG", 70000, 0.1f));
        return new MilkTea("113", "my dick", "toi pro", "thit refill", 31111, "anhdep", realIngredients);
    }
}
