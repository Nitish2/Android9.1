package com.example.hp.texcolor_menu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView ; //Creating Text view object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing Text view object
        textView=(TextView)findViewById(R.id.textView);

    }

    /**
     * Creating onCreateOptionsMenu method().
     * In this method, you can inflate your menu resource into the Menu provided in the callback.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater() method will Inflate a menu hierarchy from the specified XML resource.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Creating onOptionsItemSelected() method.
     * This method passes the MenuItem selected.
     * You can identify the item by calling getItemId() method,
        which returns the unique ID for the menu item .
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem color) {
        switch (color.getItemId()) { // Creating Switch Case for item selection from the menu

                case R.id.Blue:
                    textView.setTextColor(Color.BLUE); //Set color to blue
                    return true;
                case R.id.Yellow:
                    textView.setTextColor(Color.YELLOW); //Set color to Yellow
                    return true;
                case R.id.Red:
                    textView.setTextColor(Color.RED); // Set color to Red
                    return true;
                default:
                    return true;
            }
        }
    }



