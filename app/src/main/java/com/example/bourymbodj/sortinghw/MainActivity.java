package com.example.bourymbodj.sortinghw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private Button ascending,descending;
    private ListView mListview;
    private ArrayList<String> mArrayList;
    private ArrayAdapter<String> mArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ascending =(Button)findViewById(R.id.button1);
        descending= (Button)findViewById(R.id.button2);
        mListview= (ListView)findViewById(R.id.listView);
        mArrayList= new ArrayList<>();
        mArrayAdapter= new ArrayAdapter<String>(this,R.layout.activity_list__item,R.id.text,mArrayList);
        mListview.setAdapter(mArrayAdapter);
        mArrayList.add("Amar");
        mArrayList.add("Boury");
        mArrayList.add("Caroline");
        mArrayList.add("Danielle");
        mArrayList.add("Eve");
        mArrayList.add("Federic");
        mArrayList.add("Mohammed");
        mArrayList.add("Noellie");
        mArrayList.add("Omar");
        mArrayList.add("Ranjith");
        mArrayList.add("Zara");
        mArrayList.add("Xavier");
        ascending.setOnClickListener(this);
        descending.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.button1) {
            Collections.sort(mArrayList);

        }
        else if ( v.getId()== R.id.button2){
            Collections.sort(mArrayList, Collections.reverseOrder());
        }
         mArrayAdapter.notifyDataSetChanged();
    }
}
