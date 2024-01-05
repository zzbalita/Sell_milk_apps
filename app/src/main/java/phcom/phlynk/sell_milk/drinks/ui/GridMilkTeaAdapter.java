package phcom.phlynk.sell_milk.drinks.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import phcom.phlynk.sell_milk.Adapter.MilkTeaStoreAdapter;
import phcom.phlynk.sell_milk.databinding.ItemGridMilkTeaBinding;
import phcom.phlynk.sell_milk.drinks.data.model.MilkTea;
import phcom.phlynk.sell_milk.drinks.data.model.MilkTeaOrder;

public class GridMilkTeaAdapter extends RecyclerView.Adapter<GridMilkTeaAdapter.ViewHolder> {
    private List<MilkTea> milkTeas;
    public OnClickCallBack callBack;

    public GridMilkTeaAdapter(List<MilkTea> milkTeas){
        this.milkTeas = milkTeas;
        this.callBack = callBack;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemGridMilkTeaBinding binding = ItemGridMilkTeaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);


        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MilkTea milkTea = milkTeas.get(position);
        holder.binding.tvMilkTeaName.setText(milkTea.getName());
        holder.binding.tvMilkTeaPrice.setText(milkTea.getTotalCost()+"đ");
        holder.binding.cvMilkTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.onItemClicked(milkTea);

            }
        });
    }

    @Override
    public int getItemCount() {
        return milkTeas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemGridMilkTeaBinding binding;
        public ViewHolder(@NonNull View view){
            super(view);
            binding = ItemGridMilkTeaBinding.bind(view);
        }

    }
    public interface OnClickCallBack{
        void onItemClicked(MilkTea milkTea);
    }

}
