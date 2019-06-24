package com.example.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods ={"Bacon" , "Ham" , "Tuna" , "Candy" , "Meatball" ,"Potato" };
        ListAdapter buckyAdpter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , foods);
        ListView buckyListView = findViewById(R.id.buckyListView);
        buckyListView.setAdapter(buckyAdpter);


        buckyListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,food ,Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
