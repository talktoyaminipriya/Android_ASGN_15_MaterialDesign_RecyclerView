package com.example.priya.materialdesign_recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Priya on 12/7/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    String[] SubjectValues; // array which holds the data
    Context context;
    View view1;            // holds UI
    ViewHolder viewHolder1;
    TextView textView;

    // constructor
    public MyAdapter(Context context1,String[] SubjectValues1){

        SubjectValues = SubjectValues1;
        context = context1;

    }

    // viewholder holds textview where data is displayed
public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
       // object of view
        public TextView textView;
        Context context;
        // constructor
        public ViewHolder(View v,Context context2){

            super(v);
            context = context2;
            textView = (TextView)v.findViewById(R.id.subject_textview);
            v.setOnClickListener(this); // bind the listener
        }
        @Override
    public void onClick(View view){
            Log.d("Tag","onClick"+getPosition()+" "+"Item");
            Toast.makeText(context,"The item Clicked is"+String.valueOf(getPosition()),Toast.LENGTH_SHORT).show();
        }
}
    @Override
    // binds the layout of textview
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view1 = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        viewHolder1 = new ViewHolder(view1,context);
        return viewHolder1;
    }

    @Override
    // called when data is dispalyed the textview
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textView.setText(SubjectValues[position]);

    }

    @Override
    public int getItemCount() {
        return SubjectValues.length;
    }
}
