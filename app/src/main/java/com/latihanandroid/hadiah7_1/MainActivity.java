package com.latihanandroid.hadiah7_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.rvPresident);
        recyclerView.setHasFixedSize(true);
        showPresidentToRecyclerView();
    }

    private void showPresidentToRecyclerView(){
        PresidentAdapter presidentAdapter= new PresidentAdapter(this,PresidentData.getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(presidentAdapter);
    }
}
