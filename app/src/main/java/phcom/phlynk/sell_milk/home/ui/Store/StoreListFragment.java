package phcom.phlynk.sell_milk.home.ui.Store;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import phcom.phlynk.sell_milk.Adapter.MilkTeaStoreAdapter;
import phcom.phlynk.sell_milk.bills.data.model.Bill;
import phcom.phlynk.sell_milk.databinding.FragmentStoreBinding;
import phcom.phlynk.sell_milk.drinks.data.MilkTeaFetcher;
import phcom.phlynk.sell_milk.drinks.data.model.MilkTea;
import phcom.phlynk.sell_milk.store.data.StoreFetcher;
import phcom.phlynk.sell_milk.store.data.model.Store;

public class StoreListFragment extends Fragment {

    private ArrayList<Store> stores = new ArrayList<Store>();


    public FragmentStoreBinding binding;

    private MilkTeaStoreAdapter adapter;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentStoreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        stores.add(new Store());
        stores.add(new Store("133", "hieu", "rat ngon", "0399035868", "anh dep", 13211, 11212));
        stores = StoreFetcher.fakeStores();
        adapter = new MilkTeaStoreAdapter(stores, this);
        binding.rlStore.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rlStore.setAdapter(adapter);



        return root;
    }


    @Override

    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}
