package com.example.thewallpaperstudio;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryRVAdapter extends RecyclerView.Adapter<CategoryRVAdapter.ViewHolder> {

    private ArrayList<CatergoryRVModel> catergoryRVModelArrayList;
    private Context context;

    public CategoryRVAdapter(ArrayList<CatergoryRVModel> catergoryRVModelArrayList, Context context) {
        this.catergoryRVModelArrayList = catergoryRVModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRVAdapter.ViewHolder holder, int position) {
            CatergoryRVModel catergoryRVModel = catergoryRVModelArrayList.get(position);
            holder.categoryTV.setText(catergoryRVModel.getCategory());
    }

    @Override
    public int getItemCount() {
        return catergoryRVModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView categoryTV;
        private ImageView categoryIV;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryIV = itemView.findViewById(R.id.idIVCategory);
            categoryTV = itemView.findViewById(R.id.idTVCategory);
        }
    }
}
