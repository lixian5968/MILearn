package com.lx.milearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lx.milearn.Demo4.LxVideoActivity;
import com.lx.milearn.Demo4.VideoActivityDemo;

public class AllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
    }

    public void demo4_1(View v){
        startActivity(new Intent(AllActivity.this, VideoActivityDemo.class));
    }

    public void demo4_2(View v){
        startActivity(new Intent(AllActivity.this, LxVideoActivity.class));
    }

}
