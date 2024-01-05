package phcom.phlynk.sell_milk.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import phcom.phlynk.sell_milk.databinding.ItemMilkTeaOrderBinding;
import phcom.phlynk.sell_milk.drinks.data.model.MilkTeaOrder;
import phcom.phlynk.sell_milk.drinks.data.model.RealIngredient;

public class MilkTeaOrderAdapter extends RecyclerView.Adapter<MilkTeaOrderAdapter.ViewHolder> {
    private List<MilkTeaOrder> orders;
    private Callback callback;

    public MilkTeaOrderAdapter(List<MilkTeaOrder> orders, Callback callback) {
        this.orders = orders;
        this.callback = callback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMilkTeaOrderBinding binding = ItemMilkTeaOrderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MilkTeaOrder order = orders.get(position);
        Glide.with(holder.binding.getRoot().getContext())
                .load(order.getMilkTea().getCoverImage())
                .centerCrop()
                .into(holder.binding.imgMilkTeaCover);
        holder.binding.tvQuantity.setText(order.getQuantity() + "");
        holder.binding.tvMilkTeaName.setText(order.getMilkTea().getName());
        holder.binding.tvMilkTeaPrice.setText(order.getMilkTea().getTotalCost() + "đ");
        holder.binding.tvTotalPrice.setText(order.getTotalCost() + "đ");
        StringBuilder sb = new StringBuilder();
        for (RealIngredient topping : order.getToppings()) {
            sb.append(topping.getName()).append(": ").append(topping.calculateCost()).append("đ").append("\n");
        }
        holder.binding.tvTopping.setText(sb.toString());
        holder.binding.tvSize.setText(order.getSize().title());
        holder.binding.tvSugarGauge.setText(order.getSugarGauge().title());
        holder.binding.tvIceGauge.setText(order.getIceGauge().title());
        holder.binding.rlIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (callback != null) {
                    callback.onIncreaseQuantity(order);
                }
            }
        });
        holder.binding.rlDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (callback != null) {
                    callback.onDecreaseQuantity(order);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public List<MilkTeaOrder> getOrders() {
        return orders;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMilkTeaOrderBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemMilkTeaOrderBinding.bind(itemView);
        }
    }

    public interface Callback {
        void onIncreaseQuantity(MilkTeaOrder order);

        void onDecreaseQuantity(MilkTeaOrder order);
    }
}

