package phcom.phlynk.sell_milk.drinks.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.drinks.data.model.IceGauge;
import phcom.phlynk.sell_milk.drinks.data.model.MilkTea;
import phcom.phlynk.sell_milk.drinks.data.model.MilkTeaOrder;
import phcom.phlynk.sell_milk.drinks.data.model.Size;
import phcom.phlynk.sell_milk.drinks.data.model.SugarGauge;

public class OrderFetcher {
    public static List<MilkTeaOrder> fakeMilkTeaOrder(){
        ArrayList<MilkTeaOrder> milkTeaOrders = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            milkTeaOrders.add(OrderFetcher.fakeOrders());
        }
        return milkTeaOrders;


    }

    public static MilkTeaOrder fakeOrders(){
        return new MilkTeaOrder(
                "133",
                new MilkTea(),
                new ArrayList<>(),
                "it duong",
                IceGauge.LESS,
                SugarGauge.LESS,
                Size.MEDIUM,
                100
        );
    }

}

