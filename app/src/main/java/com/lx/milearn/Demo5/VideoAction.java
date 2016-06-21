package com.lx.milearn.Demo5;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import com.lx.milearn.Demo3.RequestCode;

import java.io.Serializable;

/**
 * Created by lixian on 2016/6/21.
 */
public class VideoAction  implements Serializable {

    Activity activity;

    public VideoAction(Activity activity) {
        this.activity = activity;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case RequestCode.GET_LOCAL_VIDEO:
                Toast.makeText(activity, "VideoAction", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void startActiviy() {

        Intent it = new Intent(activity,Main5ActivityDemo2.class);
        activity.startActivityForResult(it,RequestCode.GET_LOCAL_VIDEO);


    }
}
