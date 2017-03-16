package com.example.akshobhya.cardview;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    ImageView imageView1,imageView2,imageView3,imageView4,correct1,wrong1,correct2,wrong2,correct3,wrong3,correct4,wrong4;
    Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = (CardView) findViewById(R.id.Card1);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        //Card1 Images
        correct1 = (ImageView) findViewById(R.id.correct1);
        wrong1 = (ImageView) findViewById(R.id.wrong1);
        //Card2 Images
        correct2 = (ImageView) findViewById(R.id.correct2);
        wrong2 = (ImageView) findViewById(R.id.wrong2);
        //Card3 Images
        correct3 = (ImageView) findViewById(R.id.correct3);
        wrong3 = (ImageView) findViewById(R.id.wrong3);
        //Card4 Images
        correct4 = (ImageView) findViewById(R.id.correct4);
        wrong4 = (ImageView) findViewById(R.id.wrong4);
    }
    public void Hello1(View view){

        Toast.makeText(getApplicationContext(),"You have selected Money",Toast.LENGTH_LONG).show();
        System.out.println("Hello Aksho");
        imageView1.setVisibility(View.INVISIBLE);
        correct1.setVisibility(View.VISIBLE);
        wrong1.setVisibility(View.VISIBLE);
        menu.findItem(R.id.action_name).setVisible(true);
    }
    public void cancel1(View view){
        Toast.makeText(getApplicationContext(),"Cancelled Selection",Toast.LENGTH_LONG).show();
        System.out.println("Cancelled Selection");
        imageView1.setVisibility(View.VISIBLE);
        correct1.setVisibility(View.INVISIBLE);
        wrong1.setVisibility(View.INVISIBLE);
        menu.findItem(R.id.action_name).setVisible(false);
    }
    public void Hello2(View view){

        Toast.makeText(getApplicationContext(),"You have selected Furniture",Toast.LENGTH_LONG).show();
        System.out.println("Hello Aksho");
        imageView2.setVisibility(View.INVISIBLE);
        correct2.setVisibility(View.VISIBLE);
        wrong2.setVisibility(View.VISIBLE);
        menu.findItem(R.id.action_name).setVisible(true);
    }
    public void cancel2(View view){
        Toast.makeText(getApplicationContext(),"Cancelled Selection",Toast.LENGTH_LONG).show();
        System.out.println("Cancelled Selection");
        imageView2.setVisibility(View.VISIBLE);
        correct2.setVisibility(View.INVISIBLE);
        wrong2.setVisibility(View.INVISIBLE);
        menu.findItem(R.id.action_name).setVisible(false);
    }
    public void Hello3(View view){

        Toast.makeText(getApplicationContext(),"You have selected Clothes",Toast.LENGTH_LONG).show();
        System.out.println("Hello Aksho");
        imageView3.setVisibility(View.INVISIBLE);
        correct3.setVisibility(View.VISIBLE);
        wrong3.setVisibility(View.VISIBLE);
        menu.findItem(R.id.action_name).setVisible(true);
    }
    public void cancel3(View view){
        Toast.makeText(getApplicationContext(),"Cancelled Selection",Toast.LENGTH_LONG).show();
        System.out.println("Cancelled Selection");
        imageView3.setVisibility(View.VISIBLE);
        correct3.setVisibility(View.INVISIBLE);
        wrong3.setVisibility(View.INVISIBLE);
        menu.findItem(R.id.action_name).setVisible(false);
    }
    public void Hello4(View view){

        Toast.makeText(getApplicationContext(),"You have selected Books",Toast.LENGTH_LONG).show();
        System.out.println("Hello Aksho");
        imageView4.setVisibility(View.INVISIBLE);
        correct4.setVisibility(View.VISIBLE);
        wrong4.setVisibility(View.VISIBLE);
        menu.findItem(R.id.action_name).setVisible(true);
    }
    public void cancel4(View view){
        Toast.makeText(getApplicationContext(),"Cancelled Selection",Toast.LENGTH_LONG).show();
        System.out.println("Cancelled Selection");
        imageView4.setVisibility(View.VISIBLE);
        correct4.setVisibility(View.INVISIBLE);
        wrong4.setVisibility(View.INVISIBLE);
        menu.findItem(R.id.action_name).setVisible(false);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
//        menu.findItem(R.id.action_name);
//        setVisible(false);
        this.menu = menu;
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.action_name:
                start(LoginActivity.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    protected void start(Class<?> cls){
        Intent intent = new Intent(MainActivity.this, cls);
        MainActivity.this.startActivity(intent);
    }
}
