package com.lx.milearn.Demo5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.lx.milearn.Demo3.RequestCode;
import com.lx.milearn.R;

public class Main5Activity extends AppCompatActivity {

    VideoAction videoAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        videoAction = new VideoAction(this);

    }


    public void demo5(View v){
        videoAction.startActiviy();
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case RequestCode.GET_LOCAL_VIDEO:
                Toast.makeText(Main5Activity.this, "Main5Activity", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
