package com.gameloft.bt_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etsoa, etsob;
    private TextView txtkq;
    private Button btntong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etsoa = (EditText) findViewById(R.id.etsoa);
        etsob = (EditText) findViewById(R.id.etsob);
        btntong =(Button) findViewById(R.id.btntong);

        /* public void btn_tong(View view) {

            int a = Integer.parseInt(etsoa.getText() + "");
            int b = Integer.parseInt(etsob.getText() + "");
            txtkq = (TextView) findViewById(R.id.txtkq);
            txtkq.setText((a + b) + "");
        }
        // cách 1: dùng Onclick
        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(etsoa.getText() + "");
                int b = Integer.parseInt(etsob.getText() + "");
                txtkq = (TextView) findViewById(R.id.txtkq);
                txtkq.setText((a + b) + "");
            }
        }); */
        // cacsh2: dùng  Anonymous listener
        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntong.setOnClickListener(this);
                int a = Integer.parseInt(etsoa.getText() + "");
                int b = Integer.parseInt(etsob.getText() + "");
                txtkq = (TextView) findViewById(R.id.txtkq);
                txtkq.setText((a + b) + "");
            }
        });
        // cách 3: dùng  Activity is listener

    }
}



