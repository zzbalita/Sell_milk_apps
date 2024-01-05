package phcom.phlynk.sell_milk.home.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import phcom.phlynk.sell_milk.authorization.data.UsersFetcher;
import phcom.phlynk.sell_milk.authorization.data.model.User;
import phcom.phlynk.sell_milk.authorization.ui.SignInActivity;
import phcom.phlynk.sell_milk.databinding.FragmentAccountBinding;

public class AccountFragment extends Fragment {

    private FragmentAccountBinding binding;
    public static final ArrayList<User> fakeUsers() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(132, "hieu", "108 doi can"));
        return list;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        UsersFetcher.fakeUsers();
        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
