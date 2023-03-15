package com.aulia.sejalan.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.aulia.sejalan.R;
import com.aulia.sejalan.model.ItemListPahlawan;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{

    private final Context context;
    private final ArrayList<ItemListPahlawan> p_list;

    public CustomAdapter(Context context, ArrayList<ItemListPahlawan> p_list) {
        this.context = context;
        this.p_list = p_list;
    }

    @Override
    public int getCount() {
        return p_list.size();
    }

    @Override
    public Object getItem(int position) {
        return p_list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HolderView holderView;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list,
                    parent, false);
            holderView = new HolderView(convertView);
            convertView.setTag(holderView);
        }

        else {
            holderView = (HolderView) convertView.getTag();
        }

        ItemListPahlawan list = p_list.get(position);
        holderView.iconList.setImageResource(list.getIcon());
        holderView.mediaName.setText(list.getName());
        holderView.deskripsi.setText(list.getDeskripsi());

        return convertView;
    }

    private static class HolderView{
        private final ImageView iconList;
        private final TextView mediaName;
        private final TextView deskripsi;

        public HolderView(View view){
            iconList  = view.findViewById(R.id.imagePahlawan);
            mediaName = view.findViewById(R.id.tvNamaPahlawan);
            deskripsi = view.findViewById(R.id.tvDeskripsi);
        }
    }
}