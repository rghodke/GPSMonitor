package com.example.admin.gpsmonitor;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;


public class MapActivity extends Activity {


    GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                R.id.map)).getMap();
        // to set current location
        googleMap.setMyLocationEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
