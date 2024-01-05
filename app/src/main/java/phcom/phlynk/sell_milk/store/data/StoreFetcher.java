package phcom.phlynk.sell_milk.store.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.store.data.model.Store;

public class StoreFetcher {
    public static ArrayList<Store> fakeStores(){
        ArrayList<Store> stores = new ArrayList<Store>();
        stores.add(new Store("133", "linh xinh gai", "260 doi can", "0333163004", "xinh gai", 133, 466));
        stores.add(new Store("133", "hieu dz", "260 doi can", "0333163004", "xinh gai", 133, 466));
        stores.add(new Store("133", "kien ga", "260 doi can", "0333163004", "xinh gai", 133, 466));

        return stores;
    }


}
