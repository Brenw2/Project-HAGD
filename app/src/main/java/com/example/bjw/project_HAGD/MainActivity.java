package com.example.bjw.project_HAGD;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "you created a activity");


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d("Main Activity", "Orentation is now Landscape");

        }

        else{
            Log.d("Main Activity", "Orentation is now Portrait");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity", "Resumed activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "Paused activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "you created a activity");
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


    public void registerClickHandler(View view) {
        Log.d("MainActivity", "Submit Button was clicked");

        ImageView img = (ImageView)findViewById(R.id.fuImage);
        img.setVisibility(View.INVISIBLE);
        EditText nameTxt = (EditText)findViewById(R.id.editText);
        String name =nameTxt.getText().toString();
        Log.d("MainActivity", nameTxt.getText().toString());
        if(name.equals("") || name.equals(" ")){
            Toast.makeText(MainActivity.this,"Please Enter Your First Name" , Toast.LENGTH_LONG).show();

        }
        //change this strings here for a good message for your name
        else if(name.equals("Brennan") || name.equals("Bren")){
            img.setImageResource(R.drawable.gd);
            img.setVisibility(View.VISIBLE);
            name = "Have great day " + nameTxt.getText().toString() + "!";
            Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();

        }
        else{
            img.setImageResource(R.drawable.fu);
            img.setVisibility(View.VISIBLE);
            name = "Fuck You " + nameTxt.getText().toString() + "!";
            Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();

         }
    }
}
