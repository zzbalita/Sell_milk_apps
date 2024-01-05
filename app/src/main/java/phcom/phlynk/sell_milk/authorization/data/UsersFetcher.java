package phcom.phlynk.sell_milk.authorization.data;

import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.authorization.data.model.User;

public class UsersFetcher {
    public static List<User> fakeUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "gg", "108 doi can"));
        return users;
    }
}
