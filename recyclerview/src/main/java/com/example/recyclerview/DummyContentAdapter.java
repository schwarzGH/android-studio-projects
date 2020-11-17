package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DummyContentAdapter extends RecyclerView.Adapter<DummyContentAdapter.DummyItemViewHolder> {

    private DummyContent content;

    // Provide a direct reference to each of the views within a data item
    public static class DummyItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvId;
        public TextView tvContent;
        public View itemView;

        // Create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public DummyItemViewHolder(View v) {
            super(v);
            itemView = v;
            tvId = v.findViewById(R.id.tvId);
            tvContent = v.findViewById(R.id.tvContent);
        }
    }

    // Pass in the array into the constructor
    public DummyContentAdapter(DummyContent content) {
        this.content = content;
    }

    @Override
    public DummyContentAdapter.DummyItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dummy_layout, parent, false);
        return new DummyItemViewHolder(view);
    }

    // Populating data into the item through holder
    @Override
    public void onBindViewHolder(DummyItemViewHolder holder, int position) {
        DummyItem item = this.content.getItem(position);
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(onClickListener);
        holder.tvId.setText(item.id);
        holder.tvContent.setText(item.content);
    }

    @Override
    public int getItemCount() {
        return content.getItemCount();
    }

    final private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int position = (int) view.getTag();
            DummyItem item = content.getItem(position);
            Context context = view.getContext();
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra(DetailsActivity.ARG_ITEM_ID, item.id);
            context.startActivity(intent);
        }
    };

}