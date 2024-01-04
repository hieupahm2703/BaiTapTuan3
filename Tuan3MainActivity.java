package com.example.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan3MainActivity extends AppCompatActivity {

    ListView lv;
    T3Adapter adapter;
    ArrayList<T3Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);
        lv=findViewById(R.id.tuan3lv);
        //Tao nguon du lieu
        ls.add(new T3Contact("Nguyen Van A", "18", R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Tran Van B", "17", R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Vu Van C", "18", R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Pham Van D", "18", R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Hoang Quoc E", "18", R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Ninh Van F", "18", R.drawable.ic_launcher_background));
        //Tao Adapter
        adapter=new T3Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}