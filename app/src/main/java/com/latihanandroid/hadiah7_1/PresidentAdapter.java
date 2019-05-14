package com.latihanandroid.hadiah7_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.PresidentViewHolder> {
    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<President> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<President> datas) {
        this.datas = datas;
    }

    private ArrayList<President> datas;

    public PresidentAdapter(Context context, ArrayList<President> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_view_president,parent,false);
        return new PresidentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, int position) {
        holder.tvRemarks.setText(datas.get(position).getmRemarks());
        holder.tvNama.setText(datas.get(position).getmName());
        Glide.with(context).load(getDatas().get(position).getmPhoto())
                .override(55,55)
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class PresidentViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama;
        TextView tvRemarks;
        public PresidentViewHolder(View itemView) {
            super(itemView);
            imgPhoto=(ImageView) itemView.findViewById(R.id.img_photo);
            tvNama=(TextView) itemView.findViewById(R.id.tvName);
            tvRemarks= (TextView) itemView.findViewById(R.id.tvRemarks);
        }

    }
}

