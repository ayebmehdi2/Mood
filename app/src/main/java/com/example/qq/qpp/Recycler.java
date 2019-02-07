package com.example.qq.qpp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Recycler extends RecyclerView.Adapter<Recycler.holder> {

    private Tools[] data;

    public void swapAdapter(Tools[] tools){
        if (data == tools) return;
        this.data = tools;
        if (tools != null) this.notifyDataSetChanged();
    }

    class holder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.emoji);
            textView = itemView.findViewById(R.id.text);
        }
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.mood__item, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        Tools tools = data[position];
        if (tools == null) return;
        holder.textView.setText(tools.getTitle());
        holder.imageView.setImageResource(tools.getEmojiImage());
    }

    @Override
    public int getItemCount() {
        if (data != null){
            return data.length;
        }
        return 0;
    }
}
