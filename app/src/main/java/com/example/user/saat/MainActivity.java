package com.example.user.saat;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView) findViewById(R.id.txthour);
        t2=(TextView) findViewById(R.id.txt2);
        t3=(TextView) findViewById(R.id.txtmin);

        Typeface newf=Typeface.createFromAsset(getAssets(),"fonts/digi.ttf");

        t1.setTypeface(newf);
        t2.setTypeface(newf);
        t3.setTypeface(newf);

    }
}
