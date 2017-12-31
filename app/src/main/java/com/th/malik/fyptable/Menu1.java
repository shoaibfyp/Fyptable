package com.th.malik.fyptable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.R.attr.button;

public class Menu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

    }
        public void onbuttonclick(View v){
            Intent myIntent = new Intent(this,   Breakfast.class);
            startActivity(myIntent);
        }

        public void onbuttonclick1(View v){
            Intent myIntent = new Intent(this,   Lunch_dinner.class);
            startActivity(myIntent);
        }

        public void onbuttonclick2(View v){
            Intent myIntent = new Intent(this,   Fastfood.class);
            startActivity(myIntent);
        }

        public void onbuttonclick3(View v){
            Intent myIntent = new Intent(this,   Desserts.class);
            startActivity(myIntent);
        }
    public void onbuttonclick4(View v){
        Intent myIntent = new Intent(this,   Order.class);
        startActivity(myIntent);
    }
    }

