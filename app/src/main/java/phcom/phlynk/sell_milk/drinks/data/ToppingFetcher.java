package phcom.phlynk.sell_milk.drinks.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.drinks.data.model.RealIngredient;

public class ToppingFetcher {
    public static List<RealIngredient> fakeTopping(){
        ArrayList<RealIngredient> realIngredients = new ArrayList<>();
        realIngredients.add(new RealIngredient("113", "Tran chau", "332 units", 13211, 23));
        return realIngredients;
    }
}
