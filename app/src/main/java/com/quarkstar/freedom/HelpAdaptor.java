package com.quarkstar.freedom;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maneesh on 6/20/2016.
 */
public class HelpAdaptor extends RecyclerView.Adapter<HelpAdaptor.HelpViewHolder> {

    HelpActicity helpActicity;
    ArrayList<Information> data;
    LayoutInflater inflater;

    @Override
    public HelpViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.helplist_item_row,parent,false);
        HelpViewHolder holder=new HelpViewHolder(view);
        return holder;
    }

public HelpAdaptor(HelpActicity helpActicity, ArrayList<Information> data) {
       this.helpActicity=helpActicity;
       this.data=data;
       inflater=LayoutInflater.from(helpActicity);
    }
    @Override
    public void onBindViewHolder(HelpViewHolder holder, int position) {
        holder.textView.setText(data.get(position).tital);
        holder.imageView.setImageResource(data.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class HelpViewHolder extends  RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public HelpViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.txt_row);
            imageView=(ImageView)itemView.findViewById(R.id.img_row);
        }
    }
}
