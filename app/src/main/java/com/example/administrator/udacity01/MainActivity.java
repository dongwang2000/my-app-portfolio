package com.example.administrator.udacity01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClickSpot(View v)
    {
        Toast.makeText(getApplicationContext(), "This will launch my SPOTIFY_SREAMER app!", Toast.LENGTH_SHORT).show();
    }

    public void onClickScores(View v)
    {
        Toast.makeText(getApplicationContext(), "This will launch my Scores app!", Toast.LENGTH_SHORT).show();
    }

    public void onClickLibrary(View v)
    {
        Toast.makeText(getApplicationContext(), "This will launch my Library app!", Toast.LENGTH_SHORT).show();
    }

    public void onClickBuild(View v)
    {
        Toast.makeText(getApplicationContext(), "This will launch my Build it bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void onClickBacon(View v)
    {
        Toast.makeText(getApplicationContext(), "This will launch my Bacon Reader app!", Toast.LENGTH_SHORT).show();
    }

    public void onClickCapstone(View v)
    {
        Toast.makeText(getApplicationContext(), "This will launch my Capstone:my own app!", Toast.LENGTH_SHORT).show();
    }

}
