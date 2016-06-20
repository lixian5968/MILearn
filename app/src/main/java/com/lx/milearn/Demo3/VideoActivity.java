package com.lx.milearn.Demo3;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lx.milearn.R;

import java.io.File;

public class VideoActivity extends AppCompatActivity {
    
    protected VideoMessageHelper videoMessageHelper;

    Context ct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ct =this;
    }

    public void openVideo(View v){
        videoHelper().showVideoSource(makeRequestCode(RequestCode.GET_LOCAL_VIDEO), makeRequestCode(RequestCode.CAPTURE_VIDEO));
    }

    /**
     * ********************** 视频 *******************************
     */
    private void initVideoMessageHelper() {
        videoMessageHelper = new VideoMessageHelper(VideoActivity.this, new VideoMessageHelper.VideoMessageHelperListener() {

            @Override
            public void onVideoPicked(File file, String md5) {
                MediaPlayer mediaPlayer = getVideoMediaPlayer(file);
                long duration = mediaPlayer == null ? 0 : mediaPlayer.getDuration();
                int height = mediaPlayer == null ? 0 : mediaPlayer.getVideoHeight();
                int width = mediaPlayer == null ? 0 : mediaPlayer.getVideoWidth();
//                IMMessage message = MessageBuilder.createVideoMessage(getAccount(), getSessionType(), file, duration, width, height, md5);
//                sendMessage(message);
            }
        });
    }

    /**
     * 获取视频mediaPlayer
     * @param file 视频文件
     * @return mediaPlayer
     */
    private MediaPlayer getVideoMediaPlayer(File file) {
        try {
            return MediaPlayer.create(VideoActivity.this, Uri.fromFile(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case RequestCode.GET_LOCAL_VIDEO:
                videoHelper().onGetLocalVideoResult(data);
                break;
            case RequestCode.CAPTURE_VIDEO:
                videoHelper().onCaptureVideoResult(data);
                break;
        }
    }

    private VideoMessageHelper videoHelper() {
        if (videoMessageHelper == null) {
            initVideoMessageHelper();
        }
        return videoMessageHelper;
    }

    protected int makeRequestCode(int requestCode) {
        if ((requestCode & 0xffffff00) != 0) {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        }
        return ((index + 1) << 8) + (requestCode & 0xff);
    }
    private transient int index;
    public void setIndex(int index) {
        this.index = index;
    }

}
