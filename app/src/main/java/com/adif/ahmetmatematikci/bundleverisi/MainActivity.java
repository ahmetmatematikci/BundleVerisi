package com.adif.ahmetmatematikci.bundleverisi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button bt;

int sayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        bt = (Button)findViewById(R.id.button);

        if (savedInstanceState !=null) {
           sayac = savedInstanceState.getInt("sayac");
            tv.setText("Sayac " + sayac);

        } else {
            sayac = 0;
        }



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac++;
                tv.setText("Sayac " + sayac);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putInt("sayac", sayac);
    }
}
