package com.lx.milearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lx.milearn.Demo4.LxVideoActivity;
import com.lx.milearn.Demo4.VideoActivityDemo;
import com.lx.milearn.Demo5.Main5Activity;
import com.lx.milearn.Demo6.InputDemoActivity;
import com.lx.milearn.Demo6.RecordPlayActivity;

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

    public void demo5(View v){
        startActivity(new Intent(AllActivity.this, Main5Activity.class));
    }

    public void demo6(View v){
        startActivity(new Intent(AllActivity.this, InputDemoActivity.class));
    }
    public void demo6_2(View v){
        startActivity(new Intent(AllActivity.this, RecordPlayActivity.class));
    }





}
