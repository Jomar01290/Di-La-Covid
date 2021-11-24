package com.example.di_la_covid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class yesterday extends AppCompatActivity {

    ImageView back;
    ImageView logout1;
    TextView total, today;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yesterday);

        back = findViewById(R.id.imageView);
        logout1 = findViewById(R.id.logout1);
        total = findViewById(R.id.total);
        today = findViewById(R.id.today);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(yesterday.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(yesterday.this,total.class);
                startActivity(i);
                finish();
            }
        });

        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(yesterday.this,today.class);
                startActivity(i);
                finish();
            }
        });

        logout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(yesterday.this);

                builder.setTitle("Logout");
                builder.setMessage("Are you sure?");

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                        FirebaseAuth.getInstance().signOut();
                        dialog.dismiss();

                        Intent i = new Intent(getApplicationContext(), Login.class);
                        startActivity(i);
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Do nothing
                        dialog.dismiss();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}