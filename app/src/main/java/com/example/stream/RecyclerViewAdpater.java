package com.example.stream;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdpater extends RecyclerView.Adapter<RecyclerViewAdpater.ViewHolder> {

    private ArrayList<String> names;
    private ArrayList<String> images;
    private Context context;

    public RecyclerViewAdpater(ArrayList<String> names, ArrayList<String> images, Context context) {
        this.names = names;
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context)
                .asBitmap()
                .load(images.get(i))
                .into(viewHolder.circleImageView);
        viewHolder.textView.setText(names.get(i));

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView circleImageView;
        TextView textView;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView = itemView.findViewById(R.id.circularimageVIew);
            textView = itemView.findViewById(R.id.listText);
            constraintLayout = itemView.findViewById(R.id.listlayout);
        }
    }
}
