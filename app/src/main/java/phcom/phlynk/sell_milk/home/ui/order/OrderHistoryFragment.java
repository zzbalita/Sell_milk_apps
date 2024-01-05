package phcom.phlynk.sell_milk.home.ui.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;


import java.util.ArrayList;

import phcom.phlynk.sell_milk.bills.data.BillsFetcher;
import phcom.phlynk.sell_milk.bills.data.model.Bill;
import phcom.phlynk.sell_milk.bills.ui.adapter.BillHistoryAdapter;
import phcom.phlynk.sell_milk.databinding.FragmentOrderBinding;

public class OrderHistoryFragment extends Fragment {
    private FragmentOrderBinding binding;
    private BillHistoryAdapter adapter;

    ArrayList<Bill> bills;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentOrderBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        bills = new ArrayList<Bill>();
        bills.add(new Bill());
        bills = BillsFetcher.fakeBills();

        adapter = new BillHistoryAdapter(bills, this);
        binding.rlHistoryBill.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rlHistoryBill.setAdapter(adapter);

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}