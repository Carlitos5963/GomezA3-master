package com.example.cisc.gomeza3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.cisc.gomeza3.R.id.buttonMesa;

public class MainActivity extends Activity {


    public void mesa(){
        Button buttonMesa;
        buttonMesa = (Button) findViewById(R.id.buttonMesa);
        buttonMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesa = new Intent(MainActivity.this, WebViewMesa.class);
                startActivity(mesa);
            }
        });
    }
    public void yahoo(){
        Button buttonYahoo;
        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yahoo = new Intent(MainActivity.this, WebViewYahoo.class);
                startActivity(yahoo);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesa();
        yahoo();
    }
}

