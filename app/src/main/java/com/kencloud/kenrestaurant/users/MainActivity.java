package com.kencloud.kenrestaurant.users;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity
   {
       private ImageView img_feed;
       private ImageView img_accnt;
       private ImageView img_collection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_feed = (ImageView) findViewById(R.id.image_newsfeed);
        img_feed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);
                startActivity(intent);
            }
        });

        img_accnt = (ImageView) findViewById(R.id.image_account);
        img_accnt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

       img_collection = (ImageView) findViewById(R.id.image_collection);
       img_collection.setOnClickListener(new View.OnClickListener() {
       public void onClick(View v) {
           Intent intent = new Intent(MainActivity.this, CollectionActivity.class);
           startActivity(intent);
       };
   });
   }
       @Override
       public boolean onCreateOptionsMenu(Menu menu) {
           MenuInflater inflater = getMenuInflater();
           inflater.inflate(R.menu.menu1, menu);
           return true;
       }
       public boolean onOptionsItemSelected(MenuItem item) {
           // Handle item selection
           switch (item.getItemId()) {
               case R.id.text_book_table:
                   Intent intent = new Intent(MainActivity.this, TableBookingActivity.class);
                   startActivity(intent);
                   // newGame();
                   return true;
               case R.id.text_bacon_and_mushroom_burger:
                   Intent intent3=new Intent(MainActivity.this,Food_ItemActivity.class);
                   startActivity(intent3);
                   return true;
               default:
                   return super.onOptionsItemSelected(item);
           }
       }
   }


