package com.nackademin.foureverhh.appbarrestudy181119;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolBar = (Toolbar)findViewById(R.id.my_toolbar);
        //Set the toolbar as the the app bar for the activity
        //ActionBar actionBar = setSupportActionBar(myToolBar);
        setSupportActionBar(myToolBar);
    }
}
