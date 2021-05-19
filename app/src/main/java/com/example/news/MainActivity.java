package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myNews(View view){
        Intent NewsIntent = new Intent(MainActivity.this, Business.class);
        startActivity(NewsIntent);
    }
    public void myDay(View view){
        Intent DayIntent = new Intent(MainActivity.this, Sports.class);
        startActivity(DayIntent);
    }
    public void myFact(View view){
        Intent FactIntent = new Intent(MainActivity.this, Technology.class);
        startActivity(FactIntent);
    }
    public void myLive(View view){
        Intent LiveIntent = new Intent(MainActivity.this, Entertainment.class);
        startActivity(LiveIntent);
    }
    public void myTourist(View view){
        Intent TouristIntent = new Intent(MainActivity.this, Science.class);
        startActivity(TouristIntent);
    }
    public void myRoute(View view){
        Intent RouteIntent = new Intent(MainActivity.this, Health.class);
        startActivity(RouteIntent);
    }
}