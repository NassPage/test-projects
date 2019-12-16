package com.nasserkh.testproject1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nasserkh.testproject1.DataModel.Clothe;
import com.nasserkh.testproject1.R;

import java.util.List;

public class ClothAdapter extends RecyclerView.Adapter<ClothAdapter.ClothViewHolder> {
    private List<Clothe> clothes;
    private Context context;

    public ClothAdapter(Context context, List<Clothe> clothes) {
        this.clothes = clothes;
        this.context = context;
    }

    @NonNull
    @Override
    public ClothViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_clothing_item, parent,
                false);
        return new ClothViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClothViewHolder holder, int position) {
        Clothe clothe = clothes.get(position);

        holder.visitCount.setText(String.valueOf(clothe.getVisitCount()));
        holder.title.setText(clothe.getTitle());
        holder.clothImage.setImageDrawable(clothe.getImage());
    }

    @Override
    public int getItemCount() {
        return clothes.size();
    }

    public class ClothViewHolder extends RecyclerView.ViewHolder{
        private ImageView clothImage;
        private TextView title;
        private TextView visitCount;

        public ClothViewHolder(@NonNull View itemView) {
            super(itemView);

            clothImage = itemView.findViewById(R.id.clothingImage);
            title = itemView.findViewById(R.id.clothing_title);
            visitCount = itemView.findViewById(R.id.clothing_viewCount);
        }
    }
}
