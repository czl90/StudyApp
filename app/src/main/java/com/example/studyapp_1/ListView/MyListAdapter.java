package com.example.studyapp_1.ListView;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.studyapp_1.R;

import java.security.PublicKey;

public class MyListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    public MyListAdapter(Context context){
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView_1,textView_2,textView_3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView=layoutInflater.inflate(R.layout.layout_listitem,null);
            holder.imageView=convertView.findViewById(R.id.image);
            holder.textView_1=convertView.findViewById(R.id.wz);
            holder.textView_2=convertView.findViewById(R.id.title);
            holder.textView_3=convertView.findViewById(R.id.time);
            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.textView_1.setText("思维");
        holder.textView_2.setText("导图");
        holder.textView_3.setText("这是一段文字");
        Glide.with(convertView).load("https://abc.2008php.com/2017_Website_appreciate/2017-09-16/20170916221628.jpg").into(holder.imageView);
        return convertView;
    }
}
