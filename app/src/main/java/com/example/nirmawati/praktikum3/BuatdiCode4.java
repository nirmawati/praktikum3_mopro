package com.example.nirmawati.praktikum3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nirmawati on 10/6/2017.
 */

public class BuatdiCode4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nirma4);
        ListView lv = (ListView) findViewById(R.id.listView1);
        List<String> data = new ArrayList<String>();
        data.add("satu");
        data.add("dua");
        data.add("tiga");
        data.add("empat");
        data.add("lima");
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(aa);

    }
}
