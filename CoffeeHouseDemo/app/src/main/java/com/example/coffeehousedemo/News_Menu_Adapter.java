package com.example.coffeehousedemo;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class News_Menu_Adapter extends BaseAdapter
{
    ArrayList<News_Menu_Item> array_list_news_menu_item;
    News_Menu_Item news_menu_item;
    Context Context;
    LayoutInflater layoutInflater;

    public News_Menu_Adapter( Context Context , ArrayList<News_Menu_Item> array_list_news_menu_item){
        this.array_list_news_menu_item = array_list_news_menu_item;
        this.Context = Context;
        this.layoutInflater = (LayoutInflater) Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return array_list_news_menu_item.size();
    }

    @Override
    public Object getItem(int position) {
        return array_list_news_menu_item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return array_list_news_menu_item.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View V = convertView;
        if(V == null)
            V = layoutInflater.inflate(R.layout.menu_item, null , true);

        ImageView image = V.findViewById(R.id.menu_item_IV);
        TextView title = V.findViewById(R.id.menu_item_TV);

        news_menu_item = array_list_news_menu_item.get(position);
        image.setImageResource(news_menu_item.getImage());
        title.setText(news_menu_item.getTitle());
        return V;
    }
}
