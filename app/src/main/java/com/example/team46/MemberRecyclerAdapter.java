package com.example.team46;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;

public class MemberRecyclerAdapter extends RecyclerView.Adapter<MemberRecyclerAdapter.ViewHolder> {

    private ArrayList<Members> members;

    MemberRecyclerAdapter(ArrayList<Members> members) {
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
        Picasso.get().load(m.getImageURL()).placeholder(R.drawable.user_placeholder).into(holder.mImageView);

        setAnimation(holder.itemView, position);

    }

    private int lastPosition = -1;

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            anim.setDuration(new Random().nextInt(501));
            viewToAnimate.startAnimation(anim);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView mImageView;
        final TextView mTxtname;
        final TextView mTxtlocation;

        ViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img);
            mTxtname = itemView.findViewById(R.id.text_name);
            mTxtlocation = itemView.findViewById(R.id.text_location);
        }
    }
}
