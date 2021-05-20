package com.example.zalo.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zalo.MainActivity;
import com.example.zalo.R;
import com.example.zalo.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MessageViewHolder> {
    private MainActivity mainActivity;
    private List<Message> mList;

    public RecyclerViewAdapter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void setData(List<Message> mList){
        this.mList = mList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item, parent, false);
        return new MessageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Message m = mList.get(position);
        if (m!= null){
            holder.img.setImageResource(m.getSourceImg());
            holder.title.setText(m.getTitle());
            holder.content.setText(m.getContent());
            holder.hour.setText(m.getHour());
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView img;
        private TextView title, content, hour;
        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.tvTitle);
            content = itemView.findViewById(R.id.tvContent);
            hour = itemView.findViewById(R.id.tvTime);
        }
    }
}
