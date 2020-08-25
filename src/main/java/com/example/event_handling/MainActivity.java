package com.example.event_handling;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton =(Button) findViewById(R.id.button);
        mybutton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView mytext = (TextView) findViewById(R.id.mytext);
                        mytext.setText("button 1");
                    }
                }
                );
        Button mybutton1 =(Button) findViewById(R.id.button1);
        mybutton1.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView mytext = (TextView) findViewById(R.id.mytext1);
                        mytext.setText("button 2");
                    }
                }
        );
        mybutton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView mytext = (TextView) findViewById(R.id.mytext);
                        mytext.setText("long click is perform");
                        return true;
                    }
                }
        );
      }
}