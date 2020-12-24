package com.example.coffeehousedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class News_Offer_Adapter extends BaseAdapter {

    ArrayList<News_Offer_Item> array_list_news_offer_item;
    News_Offer_Item news_offer_item;
    Context Context;
    LayoutInflater layoutInflater;

    public News_Offer_Adapter( Context Context , ArrayList<News_Offer_Item> array_list_news_offer_item){
        this.array_list_news_offer_item = array_list_news_offer_item;
        this.Context = Context;
        this.layoutInflater = (LayoutInflater) Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return array_list_news_offer_item.size();
    }

    @Override
    public Object getItem(int position) {
        return array_list_news_offer_item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return array_list_news_offer_item.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View V = convertView;
        if(V == null)
            V = layoutInflater.inflate(R.layout.offer_item, null , true);

        ImageView image = V.findViewById(R.id.offer_item_IV);
        TextView title = V.findViewById(R.id.offer_item_Title);
        TextView content = V.findViewById(R.id.offer_item_Content);

        news_offer_item = array_list_news_offer_item.get(position);
        image.setImageResource(news_offer_item.getImage());
        title.setText(news_offer_item.getTitle());
        content.setText(news_offer_item.getContent());
        return V;
    }
}
