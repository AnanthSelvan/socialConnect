package com.example.socialconnect.recyclerAdapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialconnect.R;
import com.example.socialconnect.databinding.ItemLayoutBinding;
import com.example.socialconnect.viewmodel.ItemViewModel;

import java.util.List;

import javax.inject.Inject;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

   List<ItemViewModel> itemViewModel;

   @Inject
    public RecyclerViewAdapter(List<ItemViewModel> itemViewModel) {
        this.itemViewModel = itemViewModel;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemLayoutBinding itemLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.email,parent,false);
        return new ViewHolder(itemLayoutBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        ItemViewModel itemView = itemViewModel.get(position);
        holder.bind(itemView);
    }


    @Override
    public int getItemCount() {
        return itemViewModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ItemLayoutBinding itemLayoutBinding;

        public ViewHolder(ItemLayoutBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());
            this.itemLayoutBinding = itemLayoutBinding;
        }

        public void bind(ItemViewModel itemViewModel) {
            itemLayoutBinding.setViewModel(itemViewModel);
            itemLayoutBinding.executePendingBindings();
        }

        @Override
        public void onClick(View view) {
            int postion = getLayoutPosition();

        }
    }
}
