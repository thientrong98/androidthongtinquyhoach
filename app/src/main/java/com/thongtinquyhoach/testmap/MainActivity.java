package com.thongtinquyhoach.testmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.thongtinquyhoach.mymap.MToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.tv);
//        setSupportActionBar(toolbar);

//        TextView fab = findViewById(R.id.tv);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MToast.show(MainActivity.this, "This is MToast");
//            }
//        });
    }

    public void tryDefault(View view) {
        MToast.show(MainActivity.this, "This is MToast");
    }

    public void tryExpandable(View view) {
        MToast.show(MainActivity.this, "This is MToast");
    }
}