package com.example.tugas9_gits.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.tugas9_gits.DetailActivity;
import com.example.tugas9_gits.Models.HomeModel;
import com.example.tugas9_gits.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private Context context;
    private List<HomeModel> homeModel = new ArrayList<>();

    public HomeAdapter( List<HomeModel> homeModel) {
        this.homeModel = homeModel;
    }
    public HomeAdapter(Context context, List<HomeModel> homeModel) {
        this.context = context;
        this.homeModel = homeModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        HomeModel homeModels = homeModel.get(position);
        holder.tvLanguageName.setText(homeModels.getName());
        holder.tvDesc.setText(homeModels.getDescription());

        Glide.with(holder.imageLanguage.getContext())
                .load(homeModels.getUrl())
                .into(holder.imageLanguage);
       /* holder.cvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"wow",Toast.LENGTH_SHORT).show();

            }
        });*/

    }

    @Override
    public int getItemCount() {
        return homeModel.size();
    }

    public void updateData(List<HomeModel> languageList) {
        this.homeModel = languageList;
        notifyDataSetChanged();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvLanguageName;
        private TextView tvDesc;
        private ImageView imageLanguage;
        private CardView cvClick;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLanguageName = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
            imageLanguage = itemView.findViewById(R.id.image_language);
            cvClick = itemView.findViewById(R.id.cv_click);
        }
    }
}
