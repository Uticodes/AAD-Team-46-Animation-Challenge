package com.example.team46;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MemberRecyclerAdapter extends RecyclerView.Adapter<MemberRecyclerAdapter.ViewHolder> {

    private ArrayList<Members> members;

    public MemberRecyclerAdapter(ArrayList<Members> members) {
        this.members = members;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .item_member_list, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Members m = members.get(position);


        holder.mTxtname.setText(m.getName());
        holder.mTxtlocation.setText(m.getLocation());



        Picasso.get().load(m.getImageURL()).into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public final ImageView mImageView;
        public final TextView mTxtname;
        public final TextView mTxtlocation;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img);
            mTxtname = itemView.findViewById(R.id.text_name);
            mTxtlocation = itemView.findViewById(R.id.text_location);
        }
    }
}
