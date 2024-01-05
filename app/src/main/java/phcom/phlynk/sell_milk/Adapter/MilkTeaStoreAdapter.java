    package phcom.phlynk.sell_milk.Adapter;
    import phcom.phlynk.sell_milk.store.ui.StoreDetailActivity;
    import android.content.Intent;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.Button;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.ArrayList;
    import java.util.List;

    import phcom.phlynk.sell_milk.R;
    import phcom.phlynk.sell_milk.databinding.ItemStoreBinding;
    import phcom.phlynk.sell_milk.home.ui.Store.StoreListFragment;
    import phcom.phlynk.sell_milk.store.data.model.Store;

    public class MilkTeaStoreAdapter extends RecyclerView.Adapter<MilkTeaStoreAdapter.ViewHolder>{

        private List<Store> stores = new ArrayList<>();

        public MilkTeaStoreAdapter(List<Store> stores, StoreListFragment storeListFragment){
            this.stores = stores;
        }


        @NonNull
        @Override
        public MilkTeaStoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            ItemStoreBinding binding = ItemStoreBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new ViewHolder(binding.getRoot());
        }

        @Override
        public void onBindViewHolder(@NonNull MilkTeaStoreAdapter.ViewHolder holder, int position) {
            Store store = stores.get(position);
            holder.binding.tvStoreName.setText(store.getName());
            holder.binding.tvAddressName.setText(store.getAddress());

        }

        @Override
        public int getItemCount() {
            return stores.size();
        }

        public List<Store> getStores(){
            return stores;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            public Button btnStore;
            ItemStoreBinding binding;
            public ViewHolder(@NonNull View view){
                super(view);
                binding = ItemStoreBinding.bind(view);
                btnStore = view.findViewById(R.id.btn_select_store);
                btnStore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Store store = stores.get(getAdapterPosition());
                        Intent intent = new Intent(itemView.getContext(), StoreDetailActivity.class);
                        intent.putExtra("store_id", store.getId());
                        itemView.getContext().startActivity(intent);


                    }
                });

            }

        }
    }
