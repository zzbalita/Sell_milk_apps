package phcom.phlynk.sell_milk.store.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import phcom.phlynk.sell_milk.R;
import phcom.phlynk.sell_milk.databinding.ActivityStoreDetailBinding;

public class StoreDetailActivity extends FragmentActivity {
    public final String STORE_DATE = "STORE_DATA";
    private ActivityStoreDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityStoreDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}