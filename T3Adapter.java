package com.example.myapplication.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class T3Adapter extends BaseAdapter {
    private ArrayList<T3Contact> ls;
    private Context context;

    public T3Adapter(ArrayList<T3Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    //Lay ve so luong item
    @Override
    public int getCount() {
        return ls.size();
    }

    //Lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    //Lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //Tao view
    //Gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //B1 Tao view
        ViewAX vax;
        //Neu chua co view thi tao view moi
        if (convertView==null)
        {
            vax=new ViewAX(); //Tao view moi
            //Anh xa layout
            convertView= LayoutInflater.from(context).inflate(R.layout.tuan3_listview_item,null);
            //Anh xa tung thanh phan trong layout
            vax.img_hinh=convertView.findViewById(R.id.t3itemImage);
            vax.tv_ten=convertView.findViewById(R.id.t3itemTen);
            vax.tv_tuoi=convertView.findViewById(R.id.t3itemTuoi);
            //Tao template de lan sau su dung
            convertView.setTag(vax);
        }
        //Neu co roi se su dung lai view cu (Han che ton bo nho)
        else
        {
            vax=(ViewAX) convertView.getTag(); //Lay view cu
        }
        //Gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView; //Tra ve ket qua
    }

    //Dinh nghia view
    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
