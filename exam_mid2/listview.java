package com.example.exam_mid2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class listview extends AppCompatActivity {
  ListView listView;
  LinearLayout linearLayout;
  String[] comtact = {"Jayfgdedfg","milan","milan","milan","milan","milan","milan","milan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listvew1);
        linearLayout = findViewById(R.id.main);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,comtact);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
//        menu.add(0,v.getId(),0,"Yellow");
//        menu.add(0,v.getId(),0,"red");
//        menu.add(0,v.getId(),0,"blue");

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optional_menu,menu);
        menu.setHeaderTitle("Select the menu ");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()  == R.id.yellow) {
            linearLayout.setBackgroundColor(Color.YELLOW);
        }else if (item.getTitle() == "red") {
            linearLayout.setBackgroundColor(Color.RED);
        }else if (item.getTitle() == "blue") {
            linearLayout.setBackgroundColor(Color.BLUE);
        }

        return  true;
    }

    //option menu


    @Override
    public boolean onCreateOptionsMenu(Menu item) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optional_menu,item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()  == R.id.yellow) {
            linearLayout.setBackgroundColor(Color.YELLOW);
        }else if (item.getItemId() == R.id.red) {
            linearLayout.setBackgroundColor(Color.RED);
        }else if (item.getItemId() == R.id.blue) {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        return  true;
    }
}