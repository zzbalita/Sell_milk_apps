package phcom.phlynk.sell_milk.bills.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import phcom.phlynk.sell_milk.authorization.data.model.User;
import phcom.phlynk.sell_milk.bills.data.model.Bill;
import phcom.phlynk.sell_milk.bills.data.model.BillStatus;
import phcom.phlynk.sell_milk.bills.data.model.PaymentMethod;
import phcom.phlynk.sell_milk.shipment.data.model.Shipper;

public class BillsFetcher {
    public static ArrayList<Bill> fakeBills() {
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bills.add(BillsFetcher.fakeOrderStatus());
        }
        return bills;
    }

    public static Bill fakeOrderStatus() {
        return new Bill(
                "1",
                new ArrayList<>(),
                new User(),
                new Shipper(),
                PaymentMethod.ATM,
                BillStatus.ON_GOING,
                new Date()
        );
    }


}
