package com.example.di_la_covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Call_now extends AppCompatActivity {

    Button callHotline1, callHotline2, callHotline3, callHotline4;
    TextView hotline1,hotline2, hotline3, hotline4;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_now);

        callHotline1 = findViewById(R.id.callHotline1);
        callHotline2 = findViewById(R.id.callHotline2);
        callHotline3 = findViewById(R.id.callHotline3);
        callHotline4 = findViewById(R.id.callHotline4);
        hotline1 = findViewById(R.id.hotline1);
        hotline2 = findViewById(R.id.hotline2);
        hotline3 = findViewById(R.id.hotline3);
        hotline4 = findViewById(R.id.hotline4);
        back = findViewById(R.id.backkk);

        callHotline1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+hotline1.getText().toString()));

                startActivity(callIntent);
            }
        });

        callHotline2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+hotline2.getText().toString()));

                startActivity(callIntent);
            }
        });

        callHotline3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+hotline3.getText().toString()));

                startActivity(callIntent);
            }
        });

        callHotline4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+hotline4.getText().toString()));

                startActivity(callIntent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Call_now.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });


    }
}