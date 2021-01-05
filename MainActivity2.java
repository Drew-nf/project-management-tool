package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public Button button;
    ListView list_view;
    private static String[] stuff ={"shit to do","create GIT account","learn more android studio","really start the app","????????????????","PROFIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView();
        button=(Button) findViewById(R.id.back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void listView() {
        list_view=(ListView) findViewById(R.id.eee);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stuff);
       // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.activity_main3.activity_main2, stuff);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=(String)list_view.getItemAtPosition(position);
                Toast.makeText(MainActivity2.this,"position : "+position+" Value :"+value, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void openActivity() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}