package com.nackademin.foureverhh.appbarrestudy181119;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.SearchView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolBar = (Toolbar)findViewById(R.id.my_toolbar);
        //Set the toolbar as the the app bar for the activity
        //ActionBar actionBar = setSupportActionBar(myToolBar);
        setSupportActionBar(myToolBar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Main Activity");
            getSupportActionBar().setSubtitle("Sub Title");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)searchItem.getActionView();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.action_favorite:
                intent = new Intent(this,TestUpAction.class);
                startActivity(intent);
                break;
            case R.id.action_settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_search:
                Toast.makeText(this,"Search View",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
