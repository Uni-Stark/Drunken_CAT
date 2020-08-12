package com.example.drunken_cat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_back;

    Button btn_proxy1,btn_proxy2,btn_proxy3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_back = findViewById(R.id.btn_back);
        btn_proxy1 = findViewById(R.id.btn_proxy1);
        btn_proxy2 = findViewById(R.id.btn_proxy2);
        btn_proxy3 = findViewById(R.id.btn_proxy3);

        btn_proxy1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View Proxy1){
                Intent call1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:1577-1577"));
                startActivity(call1);
            }

        });
        btn_proxy2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View Proxy2){
                Intent call2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:1588-1588"));
                startActivity(call2);
            }

        });
        btn_proxy3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View Proxy3){
                Intent call3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:1599-1599"));
                startActivity(call3);
            }

        });




        btn_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View AddtoMain) {
                Intent back_intent = new Intent(MainActivity.this, proxy_back.class);
                startActivity(back_intent);
            }
        });
    }
}