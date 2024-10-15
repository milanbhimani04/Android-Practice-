package com.example.exam_mid2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int[] person ={
            R.drawable.img1,
            R.drawable.img1,
            R.drawable.img1,R.drawable.img1,
            R.drawable.img1,R.drawable.img1,R.drawable.img1,
            R.drawable.img1,
            R.drawable.img1
    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       gridView = findViewById(R.id.grid1);

       Imageclass imageclass = new Imageclass(getApplicationContext(),person);
       gridView.setAdapter(imageclass);

       gridView.setOnItemClickListener(
               new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       Toast.makeText(getApplicationContext(),"position "+i,Toast.LENGTH_LONG).show();
                   }
               }
       );
    }
}