package phcom.phlynk.sell_milk.drinks.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.drinks.data.model.Ingredient;

public class IngredientFetcher {
    public static List<Ingredient> fakeIngredients(){
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("113", "tra dao", "unit32", 20000));

        return ingredients;
    }
}
