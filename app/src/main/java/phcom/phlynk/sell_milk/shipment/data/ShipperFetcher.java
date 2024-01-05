package phcom.phlynk.sell_milk.shipment.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.shipment.data.model.Shipper;

public class ShipperFetcher {
    public static List<Shipper> fakeShippers(){
        ArrayList<Shipper> shippers = new ArrayList<>();
        shippers.add(new Shipper("133", "thinh", "0399035868", "gg@gmail.com", "dz", "tot", 133.2, 122.3));
        return shippers;
    }
}
