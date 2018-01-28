package com.example.nirmawati.praktikum3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Nirmawati on 10/6/2017.
 */

public class BuatdiCode extends Activity {
    @Override
    protected void  onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        RelativeLayout rl = new RelativeLayout(this);
        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams tvParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        tvParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tv.setText("Bismillah\nAssalamu\'alaykum");
        rl.addView(tv, tvParams);
        setContentView(rl);
    }
}


