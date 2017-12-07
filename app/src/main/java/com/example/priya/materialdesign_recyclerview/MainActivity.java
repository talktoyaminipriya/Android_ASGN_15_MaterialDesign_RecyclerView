package com.example.priya.materialdesign_recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;
    RelativeLayout relativeLayout;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    // datasource
    String[] subjects = {
            "Alpha",
            "Beta",
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        // works as layout manager
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        //object for layout manager
        layoutManager = new LinearLayoutManager(context);
        //passing recyclerview layout manager
        recyclerView.setLayoutManager(layoutManager);
        // calls MyAdapter class
        adapter = new MyAdapter(context, subjects);
        //sets adapter
        recyclerView.setAdapter(adapter);

    }

    @Override
//inflate the menu,this adds items to menu bar

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;

    }

    @Override
    //Handles item selection
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (item.getItemId()) {

            case R.id.add:
            Toast.makeText(getApplicationContext(), "Add item selected", Toast.LENGTH_SHORT).show();
            break;

            case R.id.delete:
                Toast.makeText(getApplicationContext(), "delete item selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.search:
                Toast.makeText(getApplicationContext(), "search item selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.settings:
                Toast.makeText(getApplicationContext(), "settings item selected", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}




