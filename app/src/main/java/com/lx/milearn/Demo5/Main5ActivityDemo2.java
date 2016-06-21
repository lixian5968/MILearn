package com.lx.milearn.Demo5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lx.milearn.R;

public class Main5ActivityDemo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_activity_demo2);
    }

    public void demo5(View v){
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }

}
