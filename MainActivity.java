package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

//Sql_class.DatabaseHelper mydb;
    public ImageButton check, add, active;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        active =(ImageButton) findViewById(R.id.active1);
        check =(ImageButton) findViewById(R.id.check);
        add =(ImageButton) findViewById(R.id.add2);
        active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    //    mydb=new Sql_class.DatabaseHelper(this);

    }

    public void openActivity2() {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);

    }
    public void openActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }


}